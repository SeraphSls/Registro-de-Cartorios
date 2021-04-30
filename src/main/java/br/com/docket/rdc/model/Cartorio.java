package br.com.docket.rdc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cartorio {


	@Id
	private String nome;
	
	private String endereco;
	
	private ArrayList<Certidao> certidoes;

	protected  Cartorio() {}

	public Cartorio(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public List<Certidao> getCertidoes() {
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
