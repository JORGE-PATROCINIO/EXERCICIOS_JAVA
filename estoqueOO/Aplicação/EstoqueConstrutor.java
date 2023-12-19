package Aplicação;

import java.util.Locale;
import java.util.Scanner;

import Itens.Produto;

public class EstoqueConstrutor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome:");
		String name = sc.nextLine();
		System.out.println("Preço:");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(name,preco);
		
		produto.getName();
		System.out.println("Nome atualizado = " + produto.getName());
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto.toString());//Produto = Produto.toString... toString é implicito!
		
		sc.close();
	}

}
