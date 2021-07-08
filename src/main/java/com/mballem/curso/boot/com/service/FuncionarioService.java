package com.mballem.curso.boot.com.service;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionario;

public interface FuncionarioService {

void salvar(Funcionario funcionario);
	
	void edit(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
