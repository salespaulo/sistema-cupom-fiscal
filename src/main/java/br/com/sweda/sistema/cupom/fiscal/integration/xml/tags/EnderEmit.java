package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class EnderEmit
{
    private String xLgr;

    private String nro;

    private String CEP;

    private String xBairro;

    private String xMun;

    public String getXLgr ()
    {
        return xLgr;
    }

    public void setXLgr (String xLgr)
    {
        this.xLgr = xLgr;
    }

    public String getNro ()
    {
        return nro;
    }

    public void setNro (String nro)
    {
        this.nro = nro;
    }

    public String getCEP ()
    {
        return CEP;
    }

    public void setCEP (String CEP)
    {
        this.CEP = CEP;
    }

    public String getXBairro ()
    {
        return xBairro;
    }

    public void setXBairro (String xBairro)
    {
        this.xBairro = xBairro;
    }

    public String getXMun ()
    {
        return xMun;
    }

    public void setXMun (String xMun)
    {
        this.xMun = xMun;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xLgr = "+xLgr+", nro = "+nro+", CEP = "+CEP+", xBairro = "+xBairro+", xMun = "+xMun+"]";
    }
}