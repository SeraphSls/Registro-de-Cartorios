package br.com.docket.rdc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cartorio {


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String endereco;
	
	@ManyToOne
	private Certidao certidoes;

	protected  Cartorio() {}

	public Cartorio(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Certidao getCertidoes() {
		return certidoes;
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

}
