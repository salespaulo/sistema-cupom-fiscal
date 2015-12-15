package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS00")
public class ICMS00
{
    private String CST;

    private String pICMS;

    private String vICMS;

    private String Orig;

    public String getCST ()
    {
        return CST;
    }

    public void setCST (String CST)
    {
        this.CST = CST;
    }

    public String getPICMS ()
    {
        return pICMS;
    }

    public void setPICMS (String pICMS)
    {
        this.pICMS = pICMS;
    }

    public String getVICMS ()
    {
        return vICMS;
    }

    public void setVICMS (String vICMS)
    {
        this.vICMS = vICMS;
    }

    public String getOrig ()
    {
        return Orig;
    }

    public void setOrig (String Orig)
    {
        this.Orig = Orig;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CST = "+CST+", pICMS = "+pICMS+", vICMS = "+vICMS+", Orig = "+Orig+"]";
    }
}