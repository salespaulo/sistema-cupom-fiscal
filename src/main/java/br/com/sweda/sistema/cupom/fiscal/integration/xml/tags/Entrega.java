package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Entrega
{
    private String xLgr;

    private String xCpl;

    private String nro;

    private String xBairro;

    private String xMun;

    private String UF;

    public String getXLgr ()
    {
        return xLgr;
    }

    public void setXLgr (String xLgr)
    {
        this.xLgr = xLgr;
    }

    public String getXCpl ()
    {
        return xCpl;
    }

    public void setXCpl (String xCpl)
    {
        this.xCpl = xCpl;
    }

    public String getNro ()
    {
        return nro;
    }

    public void setNro (String nro)
    {
        this.nro = nro;
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

    public String getUF ()
    {
        return UF;
    }

    public void setUF (String UF)
    {
        this.UF = UF;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xLgr = "+xLgr+", xCpl = "+xCpl+", nro = "+nro+", xBairro = "+xBairro+", xMun = "+xMun+", UF = "+UF+"]";
    }
}
