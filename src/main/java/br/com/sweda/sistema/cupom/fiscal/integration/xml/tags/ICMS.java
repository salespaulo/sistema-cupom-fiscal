package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS")
public class ICMS
{
    private ICMS00 ICMS00;

    public ICMS00 getICMS00 ()
    {
        return ICMS00;
    }

    public void setICMS00 (ICMS00 ICMS00)
    {
        this.ICMS00 = ICMS00;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ICMS00 = "+ICMS00+"]";
    }
}