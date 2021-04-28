package br.com.docket.rdc.model;

import java.util.List;

public class InformacoesCartorio {
	
	private String nome;
	private String endereco;
	
	
	
	private List<Certidao> certidoes;
	
	
	
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
