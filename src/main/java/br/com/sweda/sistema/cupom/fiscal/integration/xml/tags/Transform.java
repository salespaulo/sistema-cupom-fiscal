package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Transform
{
    private String Algorithm;

    public String getAlgorithm ()
    {
        return Algorithm;
    }

    public void setAlgorithm (String Algorithm)
    {
        this.Algorithm = Algorithm;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Algorithm = "+Algorithm+"]";
    }
}