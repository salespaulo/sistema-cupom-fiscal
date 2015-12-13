#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdarg.h>

#include <string.h>
#include <errno.h>

#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <time.h>

#include <glib.h>
#ifdef _WIN32
	#include <windows.h>
#else
	#include <linux/limits.h>
#endif

#include <SATDLL.h>


#ifdef _WIN32
static char res_path[PATH_MAX] = "res_";
#else
static char res_path[PATH_MAX] = "./res_";
#endif
static gboolean opt_verbose = FALSE;
static gint opt_sleep = 0;
static gint opt_loop_count = 1;
static gchar* opt_tid = NULL;
static gchar* opt_edv = NULL;
static gchar* opt_tff = NULL;
static gchar* opt_cso = NULL;
static gchar* opt_bs = NULL;
static gchar* opt_dbs = NULL;
static gchar* opt_atv = NULL;
static gchar* opt_cuv = NULL;
static gchar* opt_ass = NULL;
static gchar* opt_ccib = NULL;
static gchar* opt_cns = NULL;
static gchar* opt_tca = NULL;
static gchar* opt_etl = NULL;
static gchar* opt_cr = NULL;
static gchar* opt_cs = NULL;

#ifdef _WIN32
void WinMsleep(__int64 usec);
#else
static int64_t get_current_ts() {
	struct timespec tp = { 0L, 0L };
	clock_gettime(CLOCK_MONOTONIC, &tp);

	return (((int64_t) tp.tv_sec) * 1000LL)
			+ (((int64_t) tp.tv_nsec) / 1000000LL);
}
#endif
//static int get_numero_sessao(int inc) {
//	static int numero_sessao = 0;

//	if (inc > 0) {
//		numero_sessao += inc;
//		if (numero_sessao > 99999) {
//			numero_sessao = 1;
//		}
//	}

//	return numero_sessao;
//}

/* funcao copiada do Sw de ativacao */
static int get_numero_sessao(int qqrcoisa){

		int i =0;
		int d = 0;
		int resultado = 0;
		int numero[6];
		char numeroChar[7];

		for (i = 0; i < 6; i++){
				if (i==0){
						d = 1;
				}else{
						d = 0;
				}
				resultado = 10;
				while ( resultado == 10 ){
					resultado = rand() % 10  + d ;
				}
				numero[i] = resultado;
		}
		sprintf(numeroChar,"%d%d%d%d%d%d", numero[0],numero[1], numero[2], numero[3], numero[4], numero[5]);
		return atoi(numeroChar);

}


static GOptionEntry entries[] = {
	{ "verbose", 'v', 0, G_OPTION_ARG_NONE  , &opt_verbose   , "Be verbose", NULL },
	{ "sleep"  , 'S', 0, G_OPTION_ARG_INT   , &opt_sleep     , "Number of mili-seconds to sleep beteween commands", "0 ms" },
	{ "loop"   , 'L', 0, G_OPTION_ARG_INT   , &opt_loop_count, "How many times to repeat the tests", "1" },
	{ "tid"    , 'T', 0, G_OPTION_ARG_STRING, &opt_tid       , "Test ID", "ex: vendas_001_6.1.3.2" },
	{ "edv"    , 'V', 0, G_OPTION_ARG_STRING, &opt_edv       , "EnviarDadosVenda", "LoopCount:CodigoDeAtivacao:DadosVendaFileName" },
	{ "tff"    , 'F', 0, G_OPTION_ARG_STRING, &opt_tff       , "TesteFimAFim", "LoopCount:CodigoDeAtivacao:DadosVendaFileName" },
	{ "cso"    , 'O', 0, G_OPTION_ARG_STRING, &opt_cso       , "ConsultarStatusOperacional", "LoopCount:CodigoDeAtivacao" },
	{ "bs"     , 'B', 0, G_OPTION_ARG_STRING, &opt_bs        , "BloquearSAT", "LoopCount:CodigoDeAtivacao" },
	{ "dbs"    , 'D', 0, G_OPTION_ARG_STRING, &opt_dbs       , "DesbloquearSAT", "LoopCount:CodigoDeAtivacao" },
	{ "atv"    , 'A', 0, G_OPTION_ARG_STRING, &opt_atv       , "AtivarSAT", "LoopCount:subComando:codigoDeAtivacao:CNPJ:cUF" },
	{ "cuv"    , 'C', 0, G_OPTION_ARG_STRING, &opt_cuv       , "CancelarUltimaVenda", "LoopCount:codigoDeAtivacao:chave:DadosCancelamentoFileName" },
	{ "ass"    , 'S', 0, G_OPTION_ARG_STRING, &opt_ass       , "AssociarAssinatura", "LoopCount:codigoDeAtivacao:CNPJvalue:assinaturaCNPJs" },
	{ "ccib"   , 'I', 0, G_OPTION_ARG_STRING, &opt_ccib      , "ComunicarCertificadoICPBRASIL", "LoopCount:codigoDeAtivacao:certificadoFileName" },
	{ "cns"    , 'N', 0, G_OPTION_ARG_STRING, &opt_cns       , "ConsultarNumeroSessao", "LoopCount:codigoDeAtivacao:numeroSessao" },
	{ "tca"    , 'R', 0, G_OPTION_ARG_STRING, &opt_tca       , "TrocarCodigoDeAtivacao", "LoopCount:codigoDeAtivacao:opcao:novoCodigo:confNovoCodigo" },
	{ "etl"    , 'E', 0, G_OPTION_ARG_STRING, &opt_etl       , "ExtrairLogs", "LoopCount:codigoDeAtivacao" },
	{ "cr"     , 'r', 0, G_OPTION_ARG_STRING, &opt_cr        , "ConfigurarInterfaceRede", "LoopCount:codigoDeAtivacao:DadosConfigFileName" },
	{ "cs"     , 'g', 0, G_OPTION_ARG_STRING, &opt_cs        , "ConsultarSAT", "LoopCount"},
	{ NULL } };

static int write_file(const char *file_name, char * buffer) {
	int fd = -1;
	int write_size = 0;
	int buffer_len = 0;
	int ret = -1;

	if (NULL == file_name) {
		printf("Invalid filename.\n");
		goto err_invalid_file_name;
	}

	if (NULL == buffer) {
		printf("Invalid buffer.\n");
		goto err_invalid_buffer;
	}

	fd = open(file_name, O_CREAT | O_WRONLY | O_TRUNC, S_IRUSR | S_IWUSR);

	if (fd < 0) {
		printf("Can't open file %s for writting. errno=[%d]\n", file_name,
				errno);
		goto err_cant_open_file;
	}

	buffer_len = strlen(buffer);

	if (buffer_len > 0) {

		write_size = write(fd, buffer, buffer_len);
		if (buffer_len != write_size) {
			printf(
					"Can't write file %s. buffer_len=[%d] != write_size=[%d]. errno=[%d]\n",
					file_name, buffer_len, write_size, errno);
			goto err_cant_write_file;
		}

	}

	ret = 0;

	do {
		break;
		err_invalid_file_name: {
			ret = -2;
		}
		break;
		err_invalid_buffer: {
			ret = -3;
		}
		break;
		err_cant_open_file: {
			ret = -4;
		}
		break;
		err_cant_write_file: {
			ret = -5;
		}
		break;
	} while (0);

	if (fd >= 0) {
		close(fd);
		fd = -1;
	}

	return ret;
}

static char * read_file(const char *file_name) {
//	char * buffer = NULL;
//	int fd = -1;
//	int read_size = 0;
//	struct stat stat_buf;
	FILE * pFile;
	long lSize;
	char * buffer;
	size_t result;


	if (NULL == file_name) {
		printf("Invalid filename.\n");
		goto err_invalid_file_name;
	}

	pFile = fopen ( file_name , "r" );
	if (pFile==NULL) {
		printf("Can't open file %s for reading. errno=[%d]\n", file_name,errno);
		goto err_cant_open_file;
	}

	// obtain file size:
	fseek (pFile , 0 , SEEK_END);
	lSize = ftell (pFile);
	rewind (pFile);

	// allocate memory to contain the whole file:
	buffer = (char*) malloc (sizeof(char)*lSize);
	memset(buffer,0, lSize);
	// copy the file into the buffer:
	result = fread (buffer,1,lSize,pFile);
	if (result != lSize) {
		printf(	"Can't read file %s. lSize=[%ld] != result=[%ld]. errno=[%d]\n",
				file_name, lSize, result, errno);
		goto err_cant_read_file;
	}
	/* the whole file is now loaded in the memory buffer. */
//printf ("\n\n\n TesteBoot size:%d, stat_buf.st_size:%d\n\n\nVenda: %s \n\n\n", strlen(buffer),lSize , buffer);

	// terminate
	fclose (pFile);

//	fd = open(file_name, O_RDONLY);

//	if (fd < 0) {
//		printf("Can't open file %s for reading. errno=[%d]\n", file_name,
//				errno);
//		goto err_cant_open_file;
//	}

//	if (0 != fstat(fd, &stat_buf)) {
//		printf("Can't stat file %s. errno=[%d]\n", file_name, errno);
//		goto err_cant_stat_file;
//	}

//	buffer = malloc(stat_buf.st_size + 1);
//	buffer[stat_buf.st_size] = '\0';
////	memset(buffer,0,stat_buf.st_size);

//	read_size = read(fd, buffer, stat_buf.st_size);
//	if (stat_buf.st_size != read_size) {
//		printf(
//				"Can't read file %s. stat_buf.st_size=[%ld] != read_size=[%d]. errno=[%d]\n",
//				file_name, stat_buf.st_size, read_size, errno);
//		goto err_cant_read_file;
//	}
//printf ("\n\n\n TesteBoot size:%d, stat_buf.st_size:%d\n\n\nVenda: %s \n\n\n", buffer, strlen(buffer),stat_buf.st_size);

	do {
		break;
		err_invalid_file_name: {
		}
		break;
		err_cant_open_file: {
		}
		break;
		err_cant_stat_file: {
		}
		break;
		err_cant_read_file: {
		}
		break;
	} while (0);

//	if (fd >= 0) {
//		close(fd);
//		fd = -1;
//	}

	return buffer;
}

static int parse_opts(const char * str, const char * arg_lst, ...) {
	int ret = -1;
	char fmt_str[1024] = { '\0' };
	int fmt_count = 0;
	va_list vl;
	va_start(vl, arg_lst);
	const char *str_p = NULL;

	if (NULL == str) {
		goto err_invalid_str;
	}

	if (strlen(arg_lst) + 1 > sizeof(fmt_str) / (sizeof("%[^':']:") - 1)) {
		printf("Sorry, my internal array can't safely handle that size.\n");
		goto err_invalid_str;
	}

	for(str_p = arg_lst; '\0' != *str_p; str_p++) {
		switch(*str_p) {
		case 'd':
			strcat(fmt_str, "%d:");
			fmt_count++;
			break;
		case 's':
			strcat(fmt_str, "%[^':']:");
			fmt_count++;
			break;
		default:
			printf("I just parse 'd' and 's' on arg_list. You passed '%c'.\n", *str_p);
			goto err_invalid_str;
			break;
		}
	}

	if (strlen(arg_lst) != fmt_count) {
		goto err_invalid_str;
	}

	if (fmt_count > 0) {

		fmt_str[strlen(fmt_str)-1] = '\0'; // remove last :
		printf("fmt_count: %d\n", fmt_count);
		ret = vsscanf(str, fmt_str, vl);
		printf("str: %s\n", str);

		if (ret != fmt_count) {
			goto err_invalid_str;
		}

	}


	ret = 0;

	do {
		break;
		err_invalid_str: {
			ret = -2;
			break;
		}
	} while (0);

	va_end(vl);

	return ret;
}

static int process(const char * pc_args) {

	int ret = -1;
	int loop_count = 0;
	int i;
	char * codigo_ativacao = NULL;
	char * cnpj = NULL;
	char * assinatura_cnpj = NULL;
	int cuf = 0;
	char * chave = NULL;
	char * input_file_name = NULL;
	char * str_ret = NULL;
	char * file_content = NULL;
	char * result_file_name = NULL;
	const char * dbg_func_name = NULL;
//    char * cnumerosessao = NULL;
		int cnumerosessao = 0;
	int sub_comando = 0;
	int pc_args_len = 0;
		int opcao = 1;
		char * novocodigo = NULL;
		char * confnovocodigo = NULL;

	if (NULL == pc_args) {
		goto warn_empty_args;
	}

	pc_args_len = strlen(pc_args);

	codigo_ativacao = malloc(pc_args_len);

	if (opt_edv == pc_args) {
		dbg_func_name = "EnviarDadosVendas";
		input_file_name = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dss", &loop_count, codigo_ativacao, input_file_name);
	} else if (opt_tff == pc_args) {
		dbg_func_name = "TesteFimAFim";
		input_file_name = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dss", &loop_count, codigo_ativacao, input_file_name);
	} else if (opt_cso == pc_args){
		dbg_func_name = "ConsultarStatusOperacional";
		ret = parse_opts(pc_args, "ds", &loop_count, codigo_ativacao);
	} else if (opt_bs == pc_args){
		dbg_func_name = "BloquearSAT";
		ret = parse_opts(pc_args, "ds", &loop_count, codigo_ativacao);
	} else if (opt_dbs == pc_args){
		dbg_func_name = "DesbloquearSAT";
		ret = parse_opts(pc_args, "ds", &loop_count, codigo_ativacao);
	} else if (opt_atv == pc_args) {
		dbg_func_name = "AtivarSAT";
		cnpj = malloc(pc_args_len);
		ret = parse_opts(pc_args, "ddssd", &loop_count, &sub_comando, codigo_ativacao, cnpj, &cuf);
	} else if (opt_cuv == pc_args) {
		dbg_func_name = "CancelarUltimaVenda";
		chave = malloc(pc_args_len);
		input_file_name = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dsss", &loop_count, codigo_ativacao, chave, input_file_name);
	} else if (opt_ass == pc_args) {
		dbg_func_name = "AssociarAssinatura";
		cnpj = malloc(pc_args_len);
		assinatura_cnpj = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dsss", &loop_count, codigo_ativacao, cnpj, assinatura_cnpj);
		printf("%s\n", assinatura_cnpj);
		printf("size: %ld\n", strlen(assinatura_cnpj));
	} else if (opt_ccib == pc_args) {
		dbg_func_name = "ComunicarCertificadoICPBRASIL";
		input_file_name = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dss", &loop_count, codigo_ativacao, input_file_name);
	}
	else if (opt_cns == pc_args)
	{
		dbg_func_name = "ConsultarNumeroSessao";
		ret = parse_opts(pc_args, "dsd", &loop_count, codigo_ativacao, &cnumerosessao);
	}
	else if (opt_tca == pc_args)
	{
		dbg_func_name = "TrocarCodigoDeAtivacao";
		novocodigo = malloc(pc_args_len);
		confnovocodigo = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dsdss", &loop_count, codigo_ativacao, &opcao, novocodigo, confnovocodigo);
	}
	else if (opt_etl == pc_args)
	{
		dbg_func_name = "ExtrairLogs";
		ret = parse_opts(pc_args, "ds", &loop_count, codigo_ativacao);
	}
	else if (opt_cr == pc_args)
	{
		dbg_func_name = "ConfigurarInterfaceDeRede";
		input_file_name = malloc(pc_args_len);
		ret = parse_opts(pc_args, "dss", &loop_count, codigo_ativacao, input_file_name);
	}
	else if (opt_cs == pc_args)
	{
		dbg_func_name = "ConsultarSAT";
		ret = parse_opts(pc_args, "d", &loop_count);
	}

	else {
		goto err_option_args;
	}

	if (0 != ret) {
		printf("Can't parse option arguments=['%s']. ret=[%d].\n", pc_args,
				ret);
		goto err_option_args;
	}

	printf("Testing %s(%d.., %s).\n", dbg_func_name,
			get_numero_sessao(0), pc_args);

	if (NULL != input_file_name) {
		file_content = read_file(input_file_name);

		if (NULL == file_content) {
			goto err_cant_open_file;
		}
//printf ("\n\n\n TesteBoot Venda: %s \n\n\n size:%d\n\n\n", file_content, strlen(file_content));

	}

	for (i = 0; i < loop_count; i++) {
		int64_t ellapsed;
#ifdef _WIN32
		LARGE_INTEGER frequency;        // ticks per second
		LARGE_INTEGER t1, t2;           // ticks

		// get ticks per second
		QueryPerformanceFrequency(&frequency);

		// start timer
		QueryPerformanceCounter(&t1);

		if (opt_edv == pc_args) {
			str_ret = EnviarDadosVenda(get_numero_sessao(1), codigo_ativacao,
					file_content);
		} else if (opt_tff == pc_args) {
			str_ret = TesteFimAFim(get_numero_sessao(1), codigo_ativacao,
					file_content);
		} else if (opt_cso == pc_args){
			str_ret = ConsultarStatusOperacional(get_numero_sessao(1), codigo_ativacao);
		} else if (opt_bs == pc_args){
			str_ret = BloquearSAT(get_numero_sessao(1), codigo_ativacao);
		} else if (opt_dbs == pc_args){
			str_ret = DesbloquearSAT(get_numero_sessao(1), codigo_ativacao);
		} else if (opt_atv == pc_args) {
			str_ret = AtivarSAT(get_numero_sessao(1), sub_comando, codigo_ativacao, cnpj, cuf);
		} else if (opt_cuv == pc_args) {
			str_ret = CancelarUltimaVenda(get_numero_sessao(1), codigo_ativacao, chave, file_content);
		} else if (opt_ass == pc_args) {
			str_ret = AssociarAssinatura(get_numero_sessao(1), codigo_ativacao, cnpj, assinatura_cnpj);
		} else if (opt_ccib == pc_args) {
			str_ret = ComunicarCertificadoICPBRASIL(get_numero_sessao(1), codigo_ativacao, file_content);
		}
		else if (opt_cns == pc_args)
		{
			str_ret = ConsultarNumeroSessao(get_numero_sessao(1), codigo_ativacao, cnumerosessao);
		}
		else if (opt_tca == pc_args)
		{
			str_ret = TrocarCodigoDeAtivacao(get_numero_sessao(1), codigo_ativacao, opcao, novocodigo, confnovocodigo);
		}
		else if (opt_etl == pc_args)
		{
			str_ret = ExtrairLogs(get_numero_sessao(1), codigo_ativacao);
		}
		else if (opt_cr == pc_args) {
			str_ret = ConfigurarInterfaceDeRede(get_numero_sessao(1), codigo_ativacao,file_content);
		}
		else if (opt_cs == pc_args) {
			str_ret = ConsultarSAT(get_numero_sessao(1));
		}
		else
		{
			goto err_option_args;
		}

		// stop timer
		QueryPerformanceCounter(&t2);

		// compute and print the elapsed time in millisec
		ellapsed = ((t2.QuadPart - t1.QuadPart) * 1000.0 / frequency.QuadPart);

#else
		int64_t start_ts;

		start_ts = get_current_ts();

		if (opt_edv == pc_args) {
			str_ret = EnviarDadosVenda(get_numero_sessao(1), codigo_ativacao,
					file_content);
		} else if (opt_tff == pc_args) {
			str_ret = TesteFimAFim(get_numero_sessao(1), codigo_ativacao,
					file_content);
		} else if (opt_cso == pc_args){
			str_ret = ConsultarStatusOperacional(get_numero_sessao(1), codigo_ativacao);
		} else if (opt_bs == pc_args){
			str_ret = BloquearSAT(get_numero_sessao(1), codigo_ativacao);
		} else if (opt_dbs == pc_args){
			str_ret = DesbloquearSAT(get_numero_sessao(1), codigo_ativacao);
		} else if (opt_atv == pc_args) {
			str_ret = AtivarSAT(get_numero_sessao(1), sub_comando, codigo_ativacao, cnpj, cuf);
		} else if (opt_cuv == pc_args) {
			str_ret = CancelarUltimaVenda(get_numero_sessao(1), codigo_ativacao, chave, file_content);
		} else if (opt_ass == pc_args) {
			str_ret = AssociarAssinatura(get_numero_sessao(1), codigo_ativacao, cnpj, assinatura_cnpj);
		} else if (opt_ccib == pc_args) {
			str_ret = ComunicarCertificadoICPBRASIL(get_numero_sessao(1), codigo_ativacao, file_content);
		}
		else if (opt_cns == pc_args)
		{
			str_ret = ConsultarNumeroSessao(get_numero_sessao(1), codigo_ativacao, cnumerosessao);
		}
		else if (opt_tca == pc_args)
		{
			str_ret = TrocarCodigoDeAtivacao(get_numero_sessao(1), codigo_ativacao, opcao, novocodigo, confnovocodigo);
		}
		else if (opt_etl == pc_args)
		{
			str_ret = ExtrairLogs(get_numero_sessao(1), codigo_ativacao);
		}
		else if (opt_cr == pc_args) {
			str_ret = ConfigurarInterfaceDeRede(get_numero_sessao(1), codigo_ativacao,file_content);
		}
		else if (opt_cs == pc_args) {
			str_ret = ConsultarSAT(get_numero_sessao(1));
		}
		else
		{
			goto err_option_args;
		}

		ellapsed = get_current_ts() - start_ts;
#endif

		if (NULL != str_ret) {
			if (NULL != input_file_name) {
				char * fn = input_file_name + strlen(input_file_name) - 1; // cutt of folder from name
				while (fn != input_file_name) {
					if ('/' == *fn) {
						fn++;
						break;
					}
					fn--;
				}
				result_file_name = g_strdup_printf("%s/%s_%d.res", res_path, fn, i);
			} else {
				result_file_name = g_strdup_printf("%s/%s_%d.res", res_path, dbg_func_name, i);
			}

			unlink(result_file_name);
			ret = write_file(result_file_name, str_ret);

#ifdef _WIN32
			printf("%s '%s' finished after %ld ms\n", dbg_func_name, result_file_name, ellapsed);
#else
			printf("%s '%s' finished after %lld ms\n", dbg_func_name, result_file_name, (long long) ellapsed);
#endif
			g_free(result_file_name);
			result_file_name = NULL;
		} else {
			if (NULL != input_file_name) {
#ifdef _WIN32
				printf("%s test failed for '%s' after %ld ms\n", dbg_func_name, input_file_name, ellapsed);
#else
				printf("%s test failed for '%s' after %lld ms\n", dbg_func_name, input_file_name, (long long) ellapsed);
#endif
			} else {
#ifdef _WIN32
				printf("%s test failed for '%s' after %ld ms\n", dbg_func_name, dbg_func_name, ellapsed);
#else
				printf("%s test failed for '%s' after %lld ms\n", dbg_func_name, dbg_func_name, (long long) ellapsed);
#endif
			}
		}

		if (TRUE == opt_verbose) {
			printf("Result:\n%s\n", str_ret);
		}

		if (opt_sleep > 0) {
			printf("Sleeping %d ms.\n", opt_sleep);
#ifdef _WIN32
//			WinMsleep(opt_sleep);
			usleep(opt_sleep * 1000L);
#else
			usleep(opt_sleep * 1000L);
#endif

		}
//Piloto esta estatico
//		free(str_ret);
//		str_ret = NULL;

	}

	ret = 0;

	do {
		break;
		warn_empty_args: {
			ret = 0;
		}
		break;
		err_option_args: {
			ret = -2;
		}
		break;
		err_cant_open_file: {
			ret = -3;
		}
		break;
	} while (0);

	g_free(result_file_name);
	result_file_name = NULL;

	free(assinatura_cnpj);
	assinatura_cnpj = NULL;

	free(chave);
	chave = NULL;

	free(cnpj);
	cnpj = NULL;

	free(file_content);
	file_content = NULL;

//	free(str_ret);
//	str_ret = NULL;

	free(input_file_name);
	input_file_name = NULL;

	free(codigo_ativacao);
	codigo_ativacao = NULL;

	free(novocodigo);
	free(confnovocodigo);


//    if (cnumerosessao != NULL)
//    {
//        free(cnumerosessao);
//        cnumerosessao = NULL;
//    }

	return ret;
}

int main(int argc, char *argv[]) {

	int ret = -1;
	GError *gerror = NULL;
	GOptionContext *context = NULL;
#ifdef _WIN32
//	char cmd_rmdir[PATH_MAX + sizeof("rmdir /S ")];
	char cmd_rmdir[PATH_MAX + sizeof("del /S /Q")];
//	char cmd_rmdir[PATH_MAX + sizeof("deltree ")];
#else
	char cmd_rmdir[PATH_MAX + sizeof("rm -rf ")];
#endif
#ifdef _WIN32
		int64_t ellapsed;
		LARGE_INTEGER frequency;        // ticks per second
		LARGE_INTEGER t1, t2;           // ticks

		// get ticks per second
		QueryPerformanceFrequency(&frequency);

		// start timer
		QueryPerformanceCounter(&t1);
#else
	int64_t start_ts = 0;

	start_ts = get_current_ts();
#endif

	context = g_option_context_new("- SAT Boot test");
	g_option_context_add_main_entries(context, entries, NULL );

	if (FALSE == g_option_context_parse(context, &argc, &argv, &gerror)) {
		g_print("option parsing failed: %s\n", gerror->message);
		goto err_options;
	}

	if (NULL == opt_tid || '\0' == opt_tid[0]) {
		opt_tid = strdup("empty_tid");
	}

	g_print("Test %s bot started.\n", opt_tid);

	strncat(res_path, opt_tid, sizeof(res_path)-1);

#ifdef _WIN32
//	snprintf(cmd_rmdir, sizeof(cmd_rmdir)-1, "rmdir /S %s", res_path);
	snprintf(cmd_rmdir, sizeof(cmd_rmdir)-1, "del /S /Q %s", res_path);
printf("%s",cmd_rmdir);
//	snprintf(cmd_rmdir, sizeof(cmd_rmdir)-1, "deltree %s", res_path);
#else
	snprintf(cmd_rmdir, sizeof(cmd_rmdir)-1, "rm -rf %s", res_path);
#endif
	ret = system(cmd_rmdir);

	if (0 != ret) {
		printf("Can't delete result folder '%s'.\n", res_path);
		goto err_cant_create_delete_folder;
	}

#if _WIN32
	ret = mkdir(res_path);
#else
	ret = mkdir(res_path, S_IRUSR | S_IWUSR | S_IXUSR);
#endif

	if (0 != ret && EEXIST != errno) {
		printf("Can't create result folder '%s'.\n", res_path);
		goto err_cant_create_result_folder;
	}

		srand (time(NULL));

	while (opt_loop_count-- > 0) {

		process(opt_edv);
		process(opt_tff);
		process(opt_cso);
		process(opt_bs);
		process(opt_dbs);
		process(opt_atv);
		process(opt_cuv);
		process(opt_ass);
		process(opt_ccib);
		process(opt_cns);
		process(opt_tca);
		process(opt_etl);
		process(opt_cr);
		process(opt_cs);

	}

	ret = 0;

	do {
		break;
		err_options: {
			ret = -2;
		}
		break;
		err_cant_create_result_folder: {
			ret = -3;
		}
		break;
		err_cant_create_delete_folder: {
			ret = -4;
		}
		break;
	} while (0);

	g_free(opt_tid);
	opt_tid = NULL;

	g_free(opt_ccib);
	opt_ccib = NULL;

	g_free(opt_ass);
	opt_ass = NULL;

	g_free(opt_cuv);
	opt_cuv = NULL;

	g_free(opt_atv);
	opt_atv = NULL;

	g_free(opt_dbs);
	opt_dbs = NULL;

	g_free(opt_bs);
	opt_bs = NULL;

	g_free(opt_cso);
	opt_cso = NULL;

	g_free(opt_tff);
	opt_tff = NULL;

	g_free(opt_edv);
	opt_edv = NULL;

		g_free(opt_cns);
		opt_cns = NULL;

		g_free(opt_tca);
		opt_tca = NULL;

	g_free(opt_etl);
	opt_etl = NULL;

	g_free(opt_cr);
	opt_cr = NULL;

	g_free(opt_cs);
	opt_cs = NULL;

	if (NULL != gerror) {
		g_error_free(gerror);
		gerror = NULL;
	}
	if (NULL != context) {
		g_option_context_free(context);
		context = NULL;
	}

#ifdef _WIN32
	// stop timer
	QueryPerformanceCounter(&t2);

	// compute and print the elapsed time in millisec
	ellapsed = ((t2.QuadPart - t1.QuadPart) * 1000.0 / frequency.QuadPart);
	g_print("Test %s bot finished after %lld ms. ret=[%d].\n", opt_tid, (long long)ellapsed, ret);
#else
	g_print("Test %s bot finished after %lld ms. ret=[%d].\n", opt_tid, (long long)(get_current_ts() - start_ts), ret);
#endif
	return ret;

}
#if _WIN32
void WinMsleep(__int64 miliSec)
{
	__int64 ellapsed=0;
	LARGE_INTEGER frequency;        // ticks per second
	LARGE_INTEGER t1, t2;           // ticks

	QueryPerformanceFrequency(&frequency);

	// start timer
	QueryPerformanceCounter(&t1);

//	printf ("usec %d\n", miliSec);
//	printf ("ellap: %ld, %ld\n", ellapsed, miliSec);
	do {
		// stop timer
		QueryPerformanceCounter(&t2);
		// compute and print the elapsed time in millisec
		ellapsed = ((t2.QuadPart - t1.QuadPart) * 1000.0 / frequency.QuadPart);
//printf ("ellap: %d, %d\n", ellapsed, miliSec);
//	} while (ellapsed < 5000);
	} while (ellapsed < miliSec);
}
#endif
