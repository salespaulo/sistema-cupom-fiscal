package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class COFINS
{
    private COFINSOutr COFINSOutr;

    public COFINSOutr getCOFINSOutr ()
    {
        return COFINSOutr;
    }

    public void setCOFINSOutr (COFINSOutr COFINSOutr)
    {
        this.COFINSOutr = COFINSOutr;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [COFINSOutr = "+COFINSOutr+"]";
    }
}