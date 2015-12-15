package br.com.sweda.sistema.cupom.fiscal.integration.sat;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;

public interface SAT extends StdCallLibrary {

    SAT INSTANCE = (SAT) Native.loadLibrary("SAT", SAT.class);
    
    public String EnviarDadosVenda(int numerosessao, String codigoDeAtivacao, CupomFiscal cupomFiscalVenda);
    
    public String CancelarUltimaVenda(int numerosessao, String codigoDeAtivacao, String chave, CupomFiscal cupomFiscalCancelamento);
    
    public String ConsultarSAT(int numeroSessao);
    
    public String TesteFimAFim(int numerosessao, String codigoDeAtivacao, CupomFiscal cupomFiscalVenda);

}