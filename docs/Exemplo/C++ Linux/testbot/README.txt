#######################################################################
                        TESTBOT 
#######################################################################
1. Introdução

    Aplicativo 'testbot' permite que todas as funções da biblioteca do 
    SAT (libSATDLL.so, no Linux) sejam executadas via linha de comando.


#######################################################################
2. Compilação passo-a-passo:

    1. Copie a libSATDLL.so para esta pasta
    2. Certifique-se de que a glib2 esteja instalada e configurada em 
    sua distribuição
    3. #make


#######################################################################
3. Execução

    As respostas da DLL serão gravadas, por padrão, na pasta 'res_empty_id', 
    que será criada automaticamente.
    
    O comando abaixo mostra as opções de uso:
    #./testbot -v -h
    Usage:
    testboot [OPTION...] - SAT Boot test

    Help Options:
      -h, --help                                                               Show help options

    Application Options:
      -v, --verbose                                                            Be verbose
      -S, --sleep=0 ms                                                         Number of mili-seconds to sleep beteween commands
      -L, --loop=1                                                             How many times to repeat the tests
      -T, --tid=ex: vendas_001_6.1.3.2                                         Test ID
      -V, --edv=LoopCount:CodigoDeAtivacao:DadosVendaFileName                  EnviarDadosVenda
      -F, --tff=LoopCount:CodigoDeAtivacao:DadosVendaFileName                  TesteFimAFim
      -O, --cso=LoopCount:CodigoDeAtivacao                                     ConsultarStatusOperacional
      -B, --bs=LoopCount:CodigoDeAtivacao                                      BloquearSAT
      -D, --dbs=LoopCount:CodigoDeAtivacao                                     DesbloquearSAT
      -a, --at=LoopCount:CodigoDeAtivacao                                      AtualizarSoftwareSAT
      -A, --atv=LoopCount:subComando:codigoDeAtivacao:CNPJ:cUF                 AtivarSAT
      -C, --cuv=LoopCount:codigoDeAtivacao:chave:DadosCancelamentoFileName     CancelarUltimaVenda
      --ass=LoopCount:codigoDeAtivacao:CNPJvalue:assinaturaCNPJs               AssociarAssinatura
      -I, --ccib=LoopCount:codigoDeAtivacao:certificadoFileName                ComunicarCertificadoICPBRASIL
      -N, --cns=LoopCount:codigoDeAtivacao:numeroSessao                        ConsultarNumeroSessao
      -R, --tca=LoopCount:codigoDeAtivacao:opcao:novoCodigo:confNovoCodigo     TrocarCodigoDeAtivacao
      -E, --etl=LoopCount:codigoDeAtivacao                                     ExtrairLogs
      -r, --cr=LoopCount:codigoDeAtivacao:DadosConfigFileName                  ConfigurarInterfaceRede
      -g, --cs=LoopCount                                                       ConsultarSAT


#######################################################################
4. Exemplo de uso

    1. ConsultarSAT
        #./testbot -v -g 1
        
    2. EnviarDadosVenda
        #./testbot -v -V 1:12345678:arquivo.xml
        
        **OBS: '12345678' é o código de ativação e 'arquivo.xml' deve estar na pasta.
    
    
#######################################################################
5. FAQ

    1. Ao executar o aplicativo, a seguinte mensagem foi exibida:
    "./testboot: error while loading shared libraries: libSATDLL.so: cannot 
    open shared object file: No such file or directory"
    
    Problema 1:
        libSATDLL.so não está instalada. 
    Solução:
        1. Se a lib estiver na pasta do executável:
            #export LD_LIBRARY_PATH=.
        2. Instalar a lib nas pastas de busca do Linux (EX: /lib, /usr/lib)
        
    Problema 2:
        Sua distribuição não possui as dependências necessárias instaladas
        por padrão.
    Solução:
        1. Eecutar:
            1.1 #ldd libSATDLL.so
            1.2 Verificar a saída
            1.3 Instalar as dependências que aparecerem como 'Not Found'
        
        
    





