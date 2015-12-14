package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class PISAliq
{
    private String CST;

    private String pPIS;

    private String vPIS;

    private String vBC;

    public String getCST ()
    {
        return CST;
    }

    public void setCST (String CST)
    {
        this.CST = CST;
    }

    public String getPPIS ()
    {
        return pPIS;
    }

    public void setPPIS (String pPIS)
    {
        this.pPIS = pPIS;
    }

    public String getVPIS ()
    {
        return vPIS;
    }

    public void setVPIS (String vPIS)
    {
        this.vPIS = vPIS;
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
        return "ClassPojo [CST = "+CST+", pPIS = "+pPIS+", vPIS = "+vPIS+", vBC = "+vBC+"]";
    }
}