package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class XMLCupom
{
    private CFe CFe;

    public CFe getCFe ()
    {
        return CFe;
    }

    public void setCFe (CFe CFe)
    {
        this.CFe = CFe;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CFe = "+CFe+"]";
    }
}