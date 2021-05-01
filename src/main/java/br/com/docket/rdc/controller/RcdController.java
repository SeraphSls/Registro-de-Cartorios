package br.com.docket.rdc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.docket.rdc.model.Cartorio;
import br.com.docket.rdc.repository.CartorioRepository;

@Controller
public class RcdController {

	@Autowired
	private CartorioRepository repository;
	
	@GetMapping("/")
	public String Hello(Model modelo) {

		List<Cartorio> cartorios = repository.listarCartorios();

		modelo.addAttribute("cartorios", cartorios);

		return "inicio";
	}

}
