package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSTot")
public class ICMSTot
{
    private String vDesc;

    private String vPISST;

    private String vCOFINS;

    private String vICMS;

    private String vProd;

    private String vOutro;

    private String vPIS;

    private String vCOFINSST;

    public String getVDesc ()
    {
        return vDesc;
    }

    public void setVDesc (String vDesc)
    {
        this.vDesc = vDesc;
    }

    public String getVPISST ()
    {
        return vPISST;
    }

    public void setVPISST (String vPISST)
    {
        this.vPISST = vPISST;
    }

    public String getVCOFINS ()
    {
        return vCOFINS;
    }

    public void setVCOFINS (String vCOFINS)
    {
        this.vCOFINS = vCOFINS;
    }

    public String getVICMS ()
    {
        return vICMS;
    }

    public void setVICMS (String vICMS)
    {
        this.vICMS = vICMS;
    }

    public String getVProd ()
    {
        return vProd;
    }

    public void setVProd (String vProd)
    {
        this.vProd = vProd;
    }

    public String getVOutro ()
    {
        return vOutro;
    }

    public void setVOutro (String vOutro)
    {
        this.vOutro = vOutro;
    }

    public String getVPIS ()
    {
        return vPIS;
    }

    public void setVPIS (String vPIS)
    {
        this.vPIS = vPIS;
    }

    public String getVCOFINSST ()
    {
        return vCOFINSST;
    }

    public void setVCOFINSST (String vCOFINSST)
    {
        this.vCOFINSST = vCOFINSST;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [vDesc = "+vDesc+", vPISST = "+vPISST+", vCOFINS = "+vCOFINS+", vICMS = "+vICMS+", vProd = "+vProd+", vOutro = "+vOutro+", vPIS = "+vPIS+", vCOFINSST = "+vCOFINSST+"]";
    }
}