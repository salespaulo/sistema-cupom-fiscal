package br.com.sweda.sistema.cupom.fiscal.model.repository;

import br.com.sweda.sistema.cupom.fiscal.model.CupomFiscal;

import java.io.Serializable;
import java.util.List;

public interface CupomFiscalRepository extends Repository<CupomFiscal> {

    List<CupomFiscal> listar();

    CupomFiscal carregar(Serializable id);

    void salvar(CupomFiscal cupomFiscal);

}
