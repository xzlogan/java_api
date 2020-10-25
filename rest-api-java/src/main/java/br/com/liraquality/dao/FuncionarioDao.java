package br.com.liraquality.dao;

import java.util.List;

import br.com.liraquality.model.Funcionario;



public interface FuncionarioDao {
    
	void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
