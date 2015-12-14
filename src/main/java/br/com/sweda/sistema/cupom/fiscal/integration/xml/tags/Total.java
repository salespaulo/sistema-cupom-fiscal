package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Total
{
    private String vCFe;

    private ICMSTot ICMSTot;

    public String getVCFe ()
    {
        return vCFe;
    }

    public void setVCFe (String vCFe)
    {
        this.vCFe = vCFe;
    }

    public ICMSTot getICMSTot ()
    {
        return ICMSTot;
    }

    public void setICMSTot (ICMSTot ICMSTot)
    {
        this.ICMSTot = ICMSTot;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [vCFe = "+vCFe+", ICMSTot = "+ICMSTot+"]";
    }
}