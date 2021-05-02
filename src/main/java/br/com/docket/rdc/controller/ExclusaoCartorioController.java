/*
 * @Author : Welber serafim 
 */
package br.com.docket.rdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.docket.rdc.enums.RotaMapping;
import br.com.docket.rdc.model.Cartorio;
import br.com.docket.rdc.to.CartorioTO;

@Controller
@RequestMapping("exclusao")
public class ExclusaoCartorioController extends AbstractController {
	
	
	/**
	 * Inicio.
	 *
	 * @param novoCartorio the novo cartorio
	 * @return the string
	 */
	@PostMapping("excluir")
	public String inicio(CartorioTO novoCartorio) {

		Cartorio novo = novoCartorio.transformToCartorio();

		super.getRepository().delete(novo);

		return RotaMapping.inicio.getDirecao();
	}
	
	

}
