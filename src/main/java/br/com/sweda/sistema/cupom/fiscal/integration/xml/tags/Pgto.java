package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Pgto
{
    private MP MP;

    private String vTroco;

    public MP getMP ()
    {
        return MP;
    }

    public void setMP (MP MP)
    {
        this.MP = MP;
    }

    public String getVTroco ()
    {
        return vTroco;
    }

    public void setVTroco (String vTroco)
    {
        this.vTroco = vTroco;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MP = "+MP+", vTroco = "+vTroco+"]";
    }
}