package Itens;

public class Produto {
	private String name;
	private double preco;
	private int quantidade;
	
	public Produto(String name,double preco,int quantidade) {
		this.name = name // duvida
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String name,double preco) {
		this.name = name;
		this.preco = preco;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double totalValor() {
		return preco * quantidade;
	}
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return 	name
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " Total: $ "
				+ String.format("%.2f", totalValor());
	}
}
