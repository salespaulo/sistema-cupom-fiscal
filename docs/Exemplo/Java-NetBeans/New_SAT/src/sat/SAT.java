package sat;
/**
 *
 * @author Wellington Felix Martins
 */
import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
public interface SAT extends StdCallLibrary {
   SAT INSTANCE = (SAT) Native.loadLibrary("SATDLL", SAT.class);
    
public String ConsultarStatusOperacional(int sessao, String cod);

public String EnviarDadosVenda(int sessao, String cod, String dados);

public String CancelarUltimaVenda(int sessao, String cod, String chave, String dadoscancel);

public String TesteFimAFim(int sessao, String cod, String dados);

public String ConsultarSAT(int sessao);

public String ConsultarNumeroSessao(int sessao, String cod, int sessao_a_ser_consultada);

public String AtivarSAT(int sessao, int tipoCert, String cod_Ativacao, String cnpj, int uf);

public String ComunicarCertificadoICPBRASIL(int sessao, String cod, String csr);

public String ConfigurarInterfaceDeRede(int sessao, String cod, String xmlConfig);

public String AssociarAssinatura(int sessao, String cod, String cnpj, String sign_cnpj);

public String DesbloquearSAT(int sessao, String cod_ativacao);

public String BloquearSAT(int sessao, String cod_ativacao);

public String TrocarCodigoDeAtivacao(int sessao, String cod_ativacao, int opcao, String nova_senha, String conf_senha);

public String ExtrairLogs(int sessao, String cod_ativacao);

}