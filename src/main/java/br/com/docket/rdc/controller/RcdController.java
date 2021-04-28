package br.com.docket.rdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RcdController {

	@GetMapping("/inicio")
	public String Hello() {
		return "inicio";
	}

}
