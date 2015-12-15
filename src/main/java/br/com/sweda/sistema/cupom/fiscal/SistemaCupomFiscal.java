package br.com.sweda.sistema.cupom.fiscal;

import br.com.sweda.sistema.cupom.fiscal.integration.xml.XmlCupomFiscalRepository;
import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;
import br.com.sweda.sistema.cupom.fiscal.model.repository.CupomFiscalRepository;

public class SistemaCupomFiscal {

    private final CupomFiscalRepository xmlRepository = new XmlCupomFiscalRepository();

    public static void main(String ...a) {
        SistemaCupomFiscal sistemaCupomFiscal = new SistemaCupomFiscal();
        sistemaCupomFiscal.executarTodoProcesso();
    }

    public void executarTodoProcesso() {
        CupomFiscal cupomFiscal = xmlRepository.carregar("cupom_fiscal.xml");
        // enviar para o SAT
        // salvar no redis
        // enviar para a Imp
    }

}
