package br.com.docket.rdc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartorio {


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String endereco;
	
	private ArrayList<String> certidoes;

	protected  Cartorio() {}
	
	public Cartorio(String nome) {
		this.nome = nome;
		certidoes = new ArrayList<String>();
	}
	
	

	public List<String> getCertidoes() {
		return certidoes;
	}

	public void setCertidoes(ArrayList<String> certidoes) {
		this.certidoes = certidoes;
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

}
