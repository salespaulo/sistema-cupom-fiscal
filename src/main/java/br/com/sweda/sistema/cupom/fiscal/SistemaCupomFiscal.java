package br.com.sweda.sistema.cupom.fiscal;

import br.com.sweda.sistema.cupom.fiscal.integration.sat.SAT;
import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;
import br.com.sweda.sistema.cupom.fiscal.service.XMLService;

public class SistemaCupomFiscal {

    private final XMLService xmlService = new XMLService();

    public static void main(String ...a) {
        SistemaCupomFiscal sistemaCupomFiscal = new SistemaCupomFiscal();
        sistemaCupomFiscal.executarTodoProcesso(a[0]);
    }

    public void executarTodoProcesso(String codigoDeAutenticacao) {
        CupomFiscal cupomFiscal = xmlService.cupomFiscalFromXML("cupom_fiscal.xml");
        cupomFiscal.setCodigoDeAtivacao(codigoDeAutenticacao);

        SAT.INSTANCE.EnviarDadosVenda(cupomFiscal.getNumeroSessao(), cupomFiscal.getCodigoDeAtivacao(), xmlService.cupomFiscalToXML(cupomFiscal));


        // enviar para o SAT
        // salvar no redis
        // enviar para a Imp
    }

}
