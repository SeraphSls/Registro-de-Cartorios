package br.com.docket.rdc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.docket.rdc.model.Cartorio;

@Repository
public class CartorioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Cartorio> listarCartorios() {
		Query query = entityManager.createQuery("select tb from Cartorio as tb", Cartorio.class);
		
		return query.getResultList();

	}

}
