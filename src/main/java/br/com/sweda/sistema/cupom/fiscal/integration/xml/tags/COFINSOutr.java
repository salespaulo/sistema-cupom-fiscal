package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class COFINSOutr
{
    private String CST;

    private String pCOFINS;

    private String vCOFINS;

    private String vBC;

    public String getCST ()
    {
        return CST;
    }

    public void setCST (String CST)
    {
        this.CST = CST;
    }

    public String getPCOFINS ()
    {
        return pCOFINS;
    }

    public void setPCOFINS (String pCOFINS)
    {
        this.pCOFINS = pCOFINS;
    }

    public String getVCOFINS ()
    {
        return vCOFINS;
    }

    public void setVCOFINS (String vCOFINS)
    {
        this.vCOFINS = vCOFINS;
    }

    public String getVBC ()
    {
        return vBC;
    }

    public void setVBC (String vBC)
    {
        this.vBC = vBC;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CST = "+CST+", pCOFINS = "+pCOFINS+", vCOFINS = "+vCOFINS+", vBC = "+vBC+"]";
    }
}