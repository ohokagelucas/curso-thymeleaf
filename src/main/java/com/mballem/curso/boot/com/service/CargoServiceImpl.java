package com.mballem.curso.boot.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.CargoDao;
import com.mballem.curso.boot.domain.Cargo;

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;
	
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void edit(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
