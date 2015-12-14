package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class CFe {

    private InfCFe infCFe;

    private Signature Signature;

    public InfCFe getInfCFe ()
    {
        return infCFe;
    }

    public void setInfCFe (InfCFe infCFe)
    {
        this.infCFe = infCFe;
    }

    public Signature getSignature ()
    {
        return Signature;
    }

    public void setSignature (Signature Signature)
    {
        this.Signature = Signature;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [infCFe = "+infCFe+", Signature = "+Signature+"]";
    }

}
