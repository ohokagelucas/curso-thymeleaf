package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mballem.curso.boot.domain.Cargo;

@Service
public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
}
