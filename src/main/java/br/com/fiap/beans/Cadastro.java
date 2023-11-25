package br.com.fiap.beans;

public class Cadastro {
	
	private String email;
	private String senha;
	
	////Construtor Vazio 
	
	public Cadastro() {
		super();
	}
	
	////Construtor Cheios
	
	public Cadastro(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	//Getters e Setters
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
