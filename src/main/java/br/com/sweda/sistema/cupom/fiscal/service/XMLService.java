package br.com.sweda.sistema.cupom.fiscal.service;

import br.com.sweda.sistema.cupom.fiscal.integration.xml.tags.CFe;
import br.com.sweda.sistema.cupom.fiscal.integration.xml.xstream.XStreamFactory;
import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;
import br.com.sweda.sistema.cupom.fiscal.util.Utils;
import com.thoughtworks.xstream.XStream;

public class XMLService {

    private final XStream xstream = XStreamFactory.getCupomFiscalConfig();

    public XMLService() {
        super();
    }

    public CupomFiscal cupomFiscalFromXML(String xml) {
        final CFe cfe = (CFe) xstream.fromXML(Utils.getInputStream(xml));
        final CupomFiscal cupomFiscal = new CupomFiscal();

        cupomFiscal.setCfe(cfe);

        return cupomFiscal;
    }

    public String cupomFiscalToXML(CupomFiscal cupomFiscal) {
        return xstream.toXML(cupomFiscal.getCfe());
    }
}
