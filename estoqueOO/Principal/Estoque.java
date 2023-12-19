package Principal;

import java.util.Locale;
import java.util.Scanner;

import Itens.Produto;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome:");
		produto.name = sc.nextLine();
		System.out.println("Preço:");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade:");
		produto.quantidade = sc.nextInt();
		
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
		System.out.println("Dados do Produto: " + produto);
		
		sc.close();	
	}

}


