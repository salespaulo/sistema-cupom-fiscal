package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class PIS
{
    private PISAliq PISAliq;

    public PISAliq getPISAliq ()
    {
        return PISAliq;
    }

    public void setPISAliq (PISAliq PISAliq)
    {
        this.PISAliq = PISAliq;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PISAliq = "+PISAliq+"]";
    }
}