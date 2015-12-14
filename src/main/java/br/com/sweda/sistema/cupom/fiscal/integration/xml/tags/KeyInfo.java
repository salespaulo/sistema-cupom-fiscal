package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class KeyInfo
{
    private X509Data X509Data;

    public X509Data getX509Data ()
    {
        return X509Data;
    }

    public void setX509Data (X509Data X509Data)
    {
        this.X509Data = X509Data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [X509Data = "+X509Data+"]";
    }
}