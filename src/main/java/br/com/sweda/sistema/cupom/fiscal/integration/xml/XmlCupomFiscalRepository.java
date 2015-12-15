package br.com.sweda.sistema.cupom.fiscal.integration.xml;

import br.com.sweda.sistema.cupom.fiscal.integration.xml.tags.CFe;
import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;
import br.com.sweda.sistema.cupom.fiscal.model.repository.CupomFiscalRepository;
import br.com.sweda.sistema.cupom.fiscal.util.Utils;
import com.thoughtworks.xstream.XStream;
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
        final String path = (String) id;
        final XStream xstream = XStreamFactory.getCupomFiscalConfig();
        final CFe cfe = (CFe) xstream.fromXML(Utils.getInputStream(path));
        final CupomFiscal cupomFiscal = new CupomFiscal();

        cupomFiscal.setCfe(cfe);

        return cupomFiscal;
    }

    @Override
    public void salvar(CupomFiscal cupomFiscal) {
        throw new NotImplementedException();
    }

}
