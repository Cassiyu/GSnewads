package br.com.fiap.beans;

public class Pessoa {
	
	private int id;
	private String sexo;
	private int idade;
	private int peso;
	private double altura;
	private String fumante;
	private String atividadeFisica;
	private String consumirFrutas;
	private String consumirLegumes;
	private String dificuldadeLocomocao;
	
	//Construtor Vazio
	
	public Pessoa() {
		super();
	}
	
	//Construtor Cheio
	
	public Pessoa(int id, String sexo, int idade, int peso, double altura, String fumante, String atividadeFisica,
			String consumirFrutas, String consumirLegumes, String dificuldadeLocomocao) {
		super();
		this.setId(id);
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.fumante = fumante;
		this.atividadeFisica = atividadeFisica;
		this.consumirFrutas = consumirFrutas;
		this.consumirLegumes = consumirLegumes;
		this.dificuldadeLocomocao = dificuldadeLocomocao;
	}
	
	//Getters e Setters
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getFumante() {
		return fumante;
	}
	public void setFumante(String fumante) {
		this.fumante = fumante;
	}
	public String getAtividadeFisica() {
		return atividadeFisica;
	}
	public void setAtividadeFisica(String atividadeFisica) {
		this.atividadeFisica = atividadeFisica;
	}
	public String getConsumirFrutas() {
		return consumirFrutas;
	}
	public void setConsumirFrutas(String consumirFrutas) {
		this.consumirFrutas = consumirFrutas;
	}
	public String getConsumirLegumes() {
		return consumirLegumes;
	}
	public void setConsumirLegumes(String consumirLegumes) {
		this.consumirLegumes = consumirLegumes;
	}
	public String getDificuldadeLocomocao() {
		return dificuldadeLocomocao;
	}
	public void setDificuldadeLocomocao(String dificuldadeLocomocao) {
		this.dificuldadeLocomocao = dificuldadeLocomocao;
	}
	
	// Overriding
		public double getImc() {
	        return Math.round(peso / (altura * altura) * 10) / 10.0;
	    }


	

	

}
