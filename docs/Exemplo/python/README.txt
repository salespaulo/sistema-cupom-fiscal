#######################################################################
                        SATEXAMPLE 
#######################################################################
1. Introdu��o

    Aplicativo simples que demonstra como chamar as fun��es da biblioteca


#######################################################################
2. Execu��o

    #python satexemple.py


#######################################################################
3. Altera��o 

    Final do arquivo:
    
    if __name__ == "__main__":
        satdll = SATDLL()
        print satdll.ConsultarSAT()
        #print satdll.ConsultarStatusOperacional()
        #print satdll.EnviarDadosVenda("1item.homolog.xml")
        
    Como pode ver, basta desmomentar as outras linhas para que outras 
    fun��es sejam executadas.


#######################################################################
4. FAQ

    1. Ao executar o aplicativo, a seguinte mensagem foi exibida:
    "OSError: libSATDLL.so: cannot open shared object file: No such file or directory!"

    Problema 1:
        libSATDLL.so n�o est� instalada. 
    Solu��o:
        1. Se a lib estiver na pasta do execut�vel:
            #export LD_LIBRARY_PATH=.
        2. Instalar a lib nas pastas de busca do Linux (EX: /lib, /usr/lib)
        
    Problema 2:
        Sua distribui��o n�o possui as depend�ncias necess�rias instaladas
        por padr�o.
    Solu��o:
        1. Eecutar:
            1.1 #ldd libSATDLL.so
            1.2 Verificar a sa�da
            1.3 Instalar as depend�ncias que aparecerem como 'Not Found'
        
        
    





