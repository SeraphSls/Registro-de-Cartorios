package br.com.docket.rdc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.docket.rdc.repository.CartorioRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractController.
 */
public abstract class AbstractController {

	/** The repository. */
	@Autowired
	private CartorioRepository repository;

	/**
	 * Gets the repository.
	 *
	 * @return the repository
	 */
	public CartorioRepository getRepository() {
		return repository;
	}


	
	
}
