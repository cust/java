package br.com.bean;

public class Estoque {
	private int id;
	private String nomeProduto;
	private int qtde;
	private double valorProduto;

	public Estoque() {
		// TODO Auto-generated constructor stub
	}

	public Estoque(int id, String nomeProduto, int qtde, double valorProduto) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.qtde = qtde;
		this.valorProduto = valorProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
}
