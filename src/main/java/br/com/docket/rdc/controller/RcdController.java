package br.com.docket.rdc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.docket.rdc.model.Cartorio;

@Controller
public class RcdController {

	@GetMapping("/inicio")
	public String Hello(Model modelo) {

		Cartorio teste = new Cartorio("Mondey D Luffy");

		List<Cartorio> cartorios = new ArrayList<>();
		cartorios.add(teste);

		modelo.addAttribute("cartorios", cartorios);

		return "inicio";
	}

}
