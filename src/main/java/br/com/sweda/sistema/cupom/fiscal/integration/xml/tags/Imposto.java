package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("imposto")
public class Imposto
{
    private PIS PIS;

    private COFINS COFINS;

    private ICMS ICMS;

    public PIS getPIS ()
    {
        return PIS;
    }

    public void setPIS (PIS PIS)
    {
        this.PIS = PIS;
    }

    public COFINS getCOFINS ()
    {
        return COFINS;
    }

    public void setCOFINS (COFINS COFINS)
    {
        this.COFINS = COFINS;
    }

    public ICMS getICMS ()
    {
        return ICMS;
    }

    public void setICMS (ICMS ICMS)
    {
        this.ICMS = ICMS;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PIS = "+PIS+", COFINS = "+COFINS+", ICMS = "+ICMS+"]";
    }
}