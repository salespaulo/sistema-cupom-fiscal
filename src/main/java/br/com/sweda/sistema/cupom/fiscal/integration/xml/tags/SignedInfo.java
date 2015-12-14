package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class SignedInfo
{
    private SignatureMethod SignatureMethod;

    private Reference Reference;

    private CanonicalizationMethod CanonicalizationMethod;

    public SignatureMethod getSignatureMethod ()
    {
        return SignatureMethod;
    }

    public void setSignatureMethod (SignatureMethod SignatureMethod)
    {
        this.SignatureMethod = SignatureMethod;
    }

    public Reference getReference ()
    {
        return Reference;
    }

    public void setReference (Reference Reference)
    {
        this.Reference = Reference;
    }

    public CanonicalizationMethod getCanonicalizationMethod ()
    {
        return CanonicalizationMethod;
    }

    public void setCanonicalizationMethod (CanonicalizationMethod CanonicalizationMethod)
    {
        this.CanonicalizationMethod = CanonicalizationMethod;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SignatureMethod = "+SignatureMethod+", Reference = "+Reference+", CanonicalizationMethod = "+CanonicalizationMethod+"]";
    }
}