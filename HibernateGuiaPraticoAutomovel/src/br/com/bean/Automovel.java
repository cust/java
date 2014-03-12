package br.com.bean;

public class Automovel {
	private int id;
	private String nome;
	private int ano;
	private String fabricantenome;

	public int getId() {
		return id;
	}

	public Automovel() {

	}

	public Automovel(int id, String nome, int ano, String fabricantenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.ano = ano;
		this.fabricantenome = fabricantenome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getFabricantenome() {
		return fabricantenome;
	}

	public void setFabricantenome(String fabricantenome) {
		this.fabricantenome = fabricantenome;
	}

}
