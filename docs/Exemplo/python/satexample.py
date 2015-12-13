# -*- coding: iso-8859-1 -*-
import os
import sys
from ctypes import *
import os
import time
import random

CODATIVACAO = c_char_p("123123123")


class SATDLL:
    def __init__(self):
        if os.name == "nt":
            self.dll = windll.LoadLibrary("SATDLL.dll")
        else:
            self.dll = cdll.LoadLibrary("libSATDLL.so")
        
    def getSessao(self):
        return c_int(random.randint(1,999999))
        
    def readAllfileCPtr(self,filename):
        f = open(filename)
        return c_char_p(f.read())
          
    def ConsultarSAT(self):
        ptr = self.dll.ConsultarSAT( self.getSessao());
        if (ptr is None):
            print ("Erro com retorno da funcao consultarSecao")
            return None
        ret = c_char_p(ptr).value
        return ret
        
    def ConsultarStatusOperacional(self):
        ptr = self.dll.ConsultarStatusOperacional(self.getSessao(), CODATIVACAO);
        if (ptr is None):
            print ("Erro com retorno da funcao consultarSecao")
            return None
        ret = c_char_p(ptr).value
        return ret
    
    def EnviarDadosVenda(self,filename):
        ptr = self.dll.EnviarDadosVenda( self.getSessao(), CODATIVACAO, self.readAllfileCPtr(filename));
        if (ptr is None):
            print ("Erro com retorno da funcao consultarSecao")
            return None
        ret = c_char_p(ptr).value
        return ret
    

if __name__ == "__main__":
    satdll = SATDLL()
    print satdll.ConsultarSAT()
    #print satdll.ConsultarStatusOperacional()
    #print satdll.EnviarDadosVenda("1item.homolog.xml")
