 package com.mballem.curso.boot.com.service;

import java.util.List;

import com.mballem.curso.boot.domain.Departamento;

public interface DepartamentoService {

void salvar(Departamento departamento);
	
	void edit(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
}
