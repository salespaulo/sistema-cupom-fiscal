package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Ide
{
    private String cNF;

    private String tpAmb;

    private String hEmi;

    private String nserieSAT;

    private String signAC;

    private String assinaturaQRCODE;

    private String mod;

    private String cDV;

    private String numeroCaixa;

    private String nCFe;

    private String dEmi;

    private String cUF;

    private String CNPJ;

    public String getCNF ()
    {
        return cNF;
    }

    public void setCNF (String cNF)
    {
        this.cNF = cNF;
    }

    public String getTpAmb ()
    {
        return tpAmb;
    }

    public void setTpAmb (String tpAmb)
    {
        this.tpAmb = tpAmb;
    }

    public String getHEmi ()
    {
        return hEmi;
    }

    public void setHEmi (String hEmi)
    {
        this.hEmi = hEmi;
    }

    public String getNserieSAT ()
    {
        return nserieSAT;
    }

    public void setNserieSAT (String nserieSAT)
    {
        this.nserieSAT = nserieSAT;
    }

    public String getSignAC ()
    {
        return signAC;
    }

    public void setSignAC (String signAC)
    {
        this.signAC = signAC;
    }

    public String getAssinaturaQRCODE ()
    {
        return assinaturaQRCODE;
    }

    public void setAssinaturaQRCODE (String assinaturaQRCODE)
    {
        this.assinaturaQRCODE = assinaturaQRCODE;
    }

    public String getMod ()
    {
        return mod;
    }

    public void setMod (String mod)
    {
        this.mod = mod;
    }

    public String getCDV ()
    {
        return cDV;
    }

    public void setCDV (String cDV)
    {
        this.cDV = cDV;
    }

    public String getNumeroCaixa ()
    {
        return numeroCaixa;
    }

    public void setNumeroCaixa (String numeroCaixa)
    {
        this.numeroCaixa = numeroCaixa;
    }

    public String getNCFe ()
    {
        return nCFe;
    }

    public void setNCFe (String nCFe)
    {
        this.nCFe = nCFe;
    }

    public String getDEmi ()
    {
        return dEmi;
    }

    public void setDEmi (String dEmi)
    {
        this.dEmi = dEmi;
    }

    public String getCUF ()
    {
        return cUF;
    }

    public void setCUF (String cUF)
    {
        this.cUF = cUF;
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
        return "ClassPojo [cNF = "+cNF+", tpAmb = "+tpAmb+", hEmi = "+hEmi+", nserieSAT = "+nserieSAT+", signAC = "+signAC+", assinaturaQRCODE = "+assinaturaQRCODE+", mod = "+mod+", cDV = "+cDV+", numeroCaixa = "+numeroCaixa+", nCFe = "+nCFe+", dEmi = "+dEmi+", cUF = "+cUF+", CNPJ = "+CNPJ+"]";
    }
}