package br.com.docket.rdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.docket.rdc.model.Cartorio;
import br.com.docket.rdc.to.CartorioTO;

@Controller
@RequestMapping("cartorio")
public class NovoCartorioController extends AbstractController {

	@PostMapping("novo")
	public String inicio(CartorioTO novoCartorio) {

		Cartorio novo = novoCartorio.transformToCartorio();

		super.getRepository().save(novo);

		return "tabelaInicio";
	}

}
