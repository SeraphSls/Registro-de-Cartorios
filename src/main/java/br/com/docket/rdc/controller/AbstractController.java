package br.com.docket.rdc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.docket.rdc.repository.CartorioRepository;

public abstract class AbstractController {

	@Autowired
	private CartorioRepository repository;

	public CartorioRepository getRepository() {
		return repository;
	}


	
	
}
