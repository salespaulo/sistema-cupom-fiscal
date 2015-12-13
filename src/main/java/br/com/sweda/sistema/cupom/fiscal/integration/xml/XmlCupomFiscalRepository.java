package br.com.sweda.sistema.cupom.fiscal.integration.xml;

import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;
import br.com.sweda.sistema.cupom.fiscal.model.repository.CupomFiscalRepository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.Serializable;
import java.util.List;

public class XmlCupomFiscalRepository implements CupomFiscalRepository {

    @Override
    public List<CupomFiscal> listar() {
        throw new NotImplementedException();
    }

    @Override
    public CupomFiscal carregar(Serializable id) {
        // TODO carregar o XML
        return null;
    }

    @Override
    public void salvar(CupomFiscal cupomFiscal) {
        throw new NotImplementedException();
    }
}
