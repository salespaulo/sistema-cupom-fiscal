package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Signature
{
    private KeyInfo KeyInfo;

    private SignedInfo SignedInfo;

    private String SignatureValue;

    private String xmlns;

    public KeyInfo getKeyInfo ()
    {
        return KeyInfo;
    }

    public void setKeyInfo (KeyInfo KeyInfo)
    {
        this.KeyInfo = KeyInfo;
    }

    public SignedInfo getSignedInfo ()
    {
        return SignedInfo;
    }

    public void setSignedInfo (SignedInfo SignedInfo)
    {
        this.SignedInfo = SignedInfo;
    }

    public String getSignatureValue ()
    {
        return SignatureValue;
    }

    public void setSignatureValue (String SignatureValue)
    {
        this.SignatureValue = SignatureValue;
    }

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [KeyInfo = "+KeyInfo+", SignedInfo = "+SignedInfo+", SignatureValue = "+SignatureValue+", xmlns = "+xmlns+"]";
    }
}