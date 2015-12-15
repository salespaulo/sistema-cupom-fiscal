package br.com.sweda.sistema.cupom.fiscal.model;

import br.com.sweda.sistema.cupom.fiscal.integration.xml.tags.CFe;

public class CupomFiscal {

    private final Integer numeroSessao;

    private String codigoDeAtivacao;

    private CFe cfe;

    public CupomFiscal() {
        super();
        this.numeroSessao = Double.valueOf(Math.random() * Integer.MAX_VALUE).intValue();
    }

    public Integer getNumeroSessao() {
        return numeroSessao;
    }

    public String getCodigoDeAtivacao() {
        return codigoDeAtivacao;
    }

    public void setCodigoDeAtivacao(String codigoDeAtivacao) {
        this.codigoDeAtivacao = codigoDeAtivacao;
    }

    public CFe getCfe() {
        return cfe;
    }

    public void setCfe(CFe cfe) {
        this.cfe = cfe;
    }

    @Override
    public String toString() {
        return cfe.toString();
    }
}
