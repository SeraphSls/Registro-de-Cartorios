/*
 * @Author : Welber serafim 
 */
package br.com.docket.rdc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.docket.rdc.model.Cartorio;

/**
 * The Interface CartorioRepository.
 */
@Repository
public interface CartorioRepository extends JpaRepository<Cartorio, Long> {

	

}
