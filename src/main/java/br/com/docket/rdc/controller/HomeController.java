/*
 * @Author : Welber serafim 
 */
package br.com.docket.rdc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.docket.rdc.model.Cartorio;

// TODO: Auto-generated Javadoc
/**
 * The Class RcdController.
 */
@Controller
public class HomeController extends AbstractController {


	/**
	 * Inicio.
	 *
	 * @return the model and view
	 */
	@GetMapping("home")
	public ModelAndView inicio() {
		
		List<Cartorio> cartorios = getRepository().findAll();
		
		ModelAndView mv = new ModelAndView("tabelaInicio");
		
		mv.addObject("cartorios", cartorios);
		return mv;
	}

}
