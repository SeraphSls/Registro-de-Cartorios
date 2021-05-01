/*
 * @Author : Welber serafim 
 */
package br.com.docket.rdc.to;

import br.com.docket.rdc.model.Cartorio;

// TODO: Auto-generated Javadoc
/**
 * The Class CartorioTO.
 */
public class CartorioTO {

	/** The id. */
	private String id;
	
	

	/** The nome. */
	private String nome;
	
	/** The endereco. */
	private String endereco;
	
	/** The certidoes. */
	private String certidoes;

	/**
	 * Transform to cartorio.
	 *
	 * @return the cartorio
	 */
	public Cartorio transformToCartorio() {

		Cartorio cartorio = new Cartorio(nome);
		cartorio.setEndereco(endereco);
		cartorio.getCertidoes().add(certidoes);
		cartorio.setId(Long.parseLong(id));
		return cartorio;

	}

	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Gets the endereco.
	 *
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Sets the endereco.
	 *
	 * @param endereco the new endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Gets the certidoes.
	 *
	 * @return the certidoes
	 */
	public String getCertidoes() {
		return certidoes;
	}

	/**
	 * Sets the certidoes.
	 *
	 * @param certidoes the new certidoes
	 */
	public void setCertidoes(String certidoes) {
		this.certidoes = certidoes;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
}
