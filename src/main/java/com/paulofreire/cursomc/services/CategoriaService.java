package com.paulofreire.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulofreire.cursomc.domain.Categoria;
import com.paulofreire.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired  // será automaticamente instanciado pelo Spring
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
