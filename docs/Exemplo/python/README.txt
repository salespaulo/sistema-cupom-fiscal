#######################################################################
                        SATEXAMPLE 
#######################################################################
1. Introdução

    Aplicativo simples que demonstra como chamar as funções da biblioteca


#######################################################################
2. Execução

    #python satexemple.py


#######################################################################
3. Alteração 

    Final do arquivo:
    
    if __name__ == "__main__":
        satdll = SATDLL()
        print satdll.ConsultarSAT()
        #print satdll.ConsultarStatusOperacional()
        #print satdll.EnviarDadosVenda("1item.homolog.xml")
        
    Como pode ver, basta desmomentar as outras linhas para que outras 
    funções sejam executadas.


#######################################################################
4. FAQ

    1. Ao executar o aplicativo, a seguinte mensagem foi exibida:
    "OSError: libSATDLL.so: cannot open shared object file: No such file or directory!"

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
        
        
    





