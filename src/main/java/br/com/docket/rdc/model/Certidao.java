package br.com.docket.rdc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certidao {

	@Id
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
