package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Dest
{
    private String xNome;

    private String CNPJ;

    public String getXNome ()
    {
        return xNome;
    }

    public void setXNome (String xNome)
    {
        this.xNome = xNome;
    }

    public String getCNPJ ()
    {
        return CNPJ;
    }

    public void setCNPJ (String CNPJ)
    {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xNome = "+xNome+", CNPJ = "+CNPJ+"]";
    }
}