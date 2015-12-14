package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Emit
{
    private String IM;

    private String xNome;

    private String indRatISSQN;

    private String cRegTribISSQN;

    private EnderEmit enderEmit;

    private String CNPJ;

    private String xFant;

    private String IE;

    private String cRegTrib;

    public String getIM ()
    {
        return IM;
    }

    public void setIM (String IM)
    {
        this.IM = IM;
    }

    public String getXNome ()
    {
        return xNome;
    }

    public void setXNome (String xNome)
    {
        this.xNome = xNome;
    }

    public String getIndRatISSQN ()
    {
        return indRatISSQN;
    }

    public void setIndRatISSQN (String indRatISSQN)
    {
        this.indRatISSQN = indRatISSQN;
    }

    public String getCRegTribISSQN ()
    {
        return cRegTribISSQN;
    }

    public void setCRegTribISSQN (String cRegTribISSQN)
    {
        this.cRegTribISSQN = cRegTribISSQN;
    }

    public EnderEmit getEnderEmit ()
    {
        return enderEmit;
    }

    public void setEnderEmit (EnderEmit enderEmit)
    {
        this.enderEmit = enderEmit;
    }

    public String getCNPJ ()
    {
        return CNPJ;
    }

    public void setCNPJ (String CNPJ)
    {
        this.CNPJ = CNPJ;
    }

    public String getXFant ()
    {
        return xFant;
    }

    public void setXFant (String xFant)
    {
        this.xFant = xFant;
    }

    public String getIE ()
    {
        return IE;
    }

    public void setIE (String IE)
    {
        this.IE = IE;
    }

    public String getCRegTrib ()
    {
        return cRegTrib;
    }

    public void setCRegTrib (String cRegTrib)
    {
        this.cRegTrib = cRegTrib;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [IM = "+IM+", xNome = "+xNome+", indRatISSQN = "+indRatISSQN+", cRegTribISSQN = "+cRegTribISSQN+", enderEmit = "+enderEmit+", CNPJ = "+CNPJ+", xFant = "+xFant+", IE = "+IE+", cRegTrib = "+cRegTrib+"]";
    }
}