package br.com.sweda.sistema.cupom.fiscal.model.repository;

import java.io.Serializable;
import java.util.List;

public interface Repository<T> {

    List<T> listar();

    T carregar(Serializable id);

    void salvar(T entity);

}
