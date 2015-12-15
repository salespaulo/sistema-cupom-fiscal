package br.com.sweda.sistema.cupom.fiscal;

import br.com.sweda.sistema.cupom.fiscal.integration.sat.SAT;
import br.com.sweda.sistema.cupom.fiscal.integration.si150.Si150;
import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;
import br.com.sweda.sistema.cupom.fiscal.service.XMLService;

public class SistemaCupomFiscal {

    private final XMLService xmlService = new XMLService();

    public static void main(String[] a) {
        SistemaCupomFiscal sistemaCupomFiscal = new SistemaCupomFiscal();
        sistemaCupomFiscal.executarTodoProcesso();
    }

    public void executarTodoProcesso() {
    	/*final String xml = "cupom_fiscal.xml";

        System.out.println("[LOG] Lendo do xml: " + xml);

        CupomFiscal cupomFiscal = xmlService.cupomFiscalDeXML(xml);

        System.out.println("[LOG] Cupom Fiscal carregado do XML: " + cupomFiscal.getCfe().toString());

        cupomFiscal.setCodigoDeAtivacao("123123123");*/
    	
    	int numeroSessao = 111111;

        System.out.println("[LOG] Consulta SAT: " + numeroSessao);

        String consultarSAT = SAT.INSTANCE.ConsultarSAT(numeroSessao);

        System.out.println("[LOG] Retorno do consulta SAT" +consultarSAT);
        
        String codigoDeAtivacao = "123123123";
        
        String consultaStatusOperacinal = SAT.INSTANCE.ConsultarStatusOperacional(numeroSessao, codigoDeAtivacao);
        
        System.out.println(consultaStatusOperacinal);
        
        int porta = Si150.INSTANCE.SI300_eBuscarPortaVelocidade();
        
        System.out.println(porta);
        
       /*System.out.println("[LOG] Enviando para o SAT: " + cupomFiscal.getCfe().toString());

        String xmlRetornoCupomFiscal = SAT.INSTANCE.EnviarDadosVenda(
                NumeroSessao,
                cupomFiscal.getCodigoDeAtivacao(),
                xmlService.cupomFiscalParaXML(cupomFiscal));

        System.out.println("[LOG] Resposta do SAT: " + xmlRetornoCupomFiscal);

        CupomFiscal retornoCupomFiscal = xmlService.cupomFiscalDeXML(xmlRetornoCupomFiscal);

        System.out.println("[LOG] Enviando para a impressora");

        Si150.INSTANCE.SI300_iImprimirXML(xmlService.cupomFiscalParaXML(retornoCupomFiscal), null, null, 0);

        System.out.println("[LOG] Enviado para a impressora com sucesso");*/
        
        
    }

}