package br.com.docket.rdc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.docket.rdc.model.Cartorio;

@Controller
public class RcdController extends AbstractController {


	@GetMapping("/")
	public ModelAndView inicio() {
		List<Cartorio> cartorios = getRepository().findAll();
		ModelAndView mv = new ModelAndView("tabelaInicio");
		mv.addObject("cartorios", cartorios);
		return mv;
	}

}
