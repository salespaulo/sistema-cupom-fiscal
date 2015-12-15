package br.com.sweda.sistema.cupom.fiscal.integration.sat;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;

public interface SAT extends StdCallLibrary {

    SAT INSTANCE = (SAT) Native.loadLibrary("D:\\\\salespaulo\\Sat\\Sat\\src\\main\\resources\\SATDLL", SAT.class);

    String EnviarDadosVenda(int numerosessao, String codigoDeAtivacao, String cupomFiscalVenda);

    String ConsultarSAT(int numeroSessao);
}