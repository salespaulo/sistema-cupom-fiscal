package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class InfCFe
{
    private Total total;

    private Emit emit;

    private Dest dest;

    private Det[] det;

    private Ide ide;

    private String Id;

    private Pgto pgto;

    private String versao;

    private String versaoDadosEnt;

    private Entrega entrega;

    private String versaoSB;

    public Total getTotal ()
    {
        return total;
    }

    public void setTotal (Total total)
    {
        this.total = total;
    }

    public Emit getEmit ()
    {
        return emit;
    }

    public void setEmit (Emit emit)
    {
        this.emit = emit;
    }

    public Dest getDest ()
    {
        return dest;
    }

    public void setDest (Dest dest)
    {
        this.dest = dest;
    }

    public Det[] getDet ()
    {
        return det;
    }

    public void setDet (Det[] det)
    {
        this.det = det;
    }

    public Ide getIde ()
    {
        return ide;
    }

    public void setIde (Ide ide)
    {
        this.ide = ide;
    }

    public String getId ()
    {
        return Id;
    }

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public Pgto getPgto ()
    {
        return pgto;
    }

    public void setPgto (Pgto pgto)
    {
        this.pgto = pgto;
    }

    public String getVersao ()
    {
        return versao;
    }

    public void setVersao (String versao)
    {
        this.versao = versao;
    }

    public String getVersaoDadosEnt ()
    {
        return versaoDadosEnt;
    }

    public void setVersaoDadosEnt (String versaoDadosEnt)
    {
        this.versaoDadosEnt = versaoDadosEnt;
    }

    public Entrega getEntrega ()
    {
        return entrega;
    }

    public void setEntrega (Entrega entrega)
    {
        this.entrega = entrega;
    }

    public String getVersaoSB ()
    {
        return versaoSB;
    }

    public void setVersaoSB (String versaoSB)
    {
        this.versaoSB = versaoSB;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", emit = "+emit+", dest = "+dest+", det = "+det+", ide = "+ide+", Id = "+Id+", pgto = "+pgto+", versao = "+versao+", versaoDadosEnt = "+versaoDadosEnt+", entrega = "+entrega+", versaoSB = "+versaoSB+"]";
    }
}