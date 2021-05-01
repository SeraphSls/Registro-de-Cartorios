package br.com.docket.rdc.to;

import br.com.docket.rdc.model.Cartorio;

public class CartorioTO {

	private String nome;
	private String endereco;
	private String certidoes;

	public Cartorio transformToCartorio() {

		Cartorio cartorio = new Cartorio(nome);
		cartorio.setEndereco(endereco);
		cartorio.getCertidoes().add(certidoes);
		return cartorio;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCertidoes() {
		return certidoes;
	}

	public void setCertidoes(String certidoes) {
		this.certidoes = certidoes;
	}

}
