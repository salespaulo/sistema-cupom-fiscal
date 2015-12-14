package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class MP
{
    private String cAdmC;

    private String vMP;

    private String cMP;

    public String getCAdmC ()
    {
        return cAdmC;
    }

    public void setCAdmC (String cAdmC)
    {
        this.cAdmC = cAdmC;
    }

    public String getVMP ()
    {
        return vMP;
    }

    public void setVMP (String vMP)
    {
        this.vMP = vMP;
    }

    public String getCMP ()
    {
        return cMP;
    }

    public void setCMP (String cMP)
    {
        this.cMP = cMP;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cAdmC = "+cAdmC+", vMP = "+vMP+", cMP = "+cMP+"]";
    }
}