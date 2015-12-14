package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Reference
{
    private Transforms Transforms;

    private DigestMethod DigestMethod;

    private String DigestValue;

    private String URI;

    public Transforms getTransforms ()
    {
        return Transforms;
    }

    public void setTransforms (Transforms Transforms)
    {
        this.Transforms = Transforms;
    }

    public DigestMethod getDigestMethod ()
    {
        return DigestMethod;
    }

    public void setDigestMethod (DigestMethod DigestMethod)
    {
        this.DigestMethod = DigestMethod;
    }

    public String getDigestValue ()
    {
        return DigestValue;
    }

    public void setDigestValue (String DigestValue)
    {
        this.DigestValue = DigestValue;
    }

    public String getURI ()
    {
        return URI;
    }

    public void setURI (String URI)
    {
        this.URI = URI;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Transforms = "+Transforms+", DigestMethod = "+DigestMethod+", DigestValue = "+DigestValue+", URI = "+URI+"]";
    }
}