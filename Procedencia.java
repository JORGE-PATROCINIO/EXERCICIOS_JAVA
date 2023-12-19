package Procedencia;

import java.util.Scanner;

public class Procedencia {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o código de origem:");
		int Codigo = SC.nextInt();
		System.out.println("Digite o preço:  ");
		float Preco = SC.nextFloat();
		
		switch(Codigo) {
			case 1:
				System.out.println("Produto do Sul !");
				break;
			case 2:
				System.out.println("Produto do Norte !");
				break;
			case 3:
				System.out.println("Produto do Leste !");
				break;
			case 4:
				System.out.println("Produto do Oeste !");
				break;
			case 5,6,21,22,23,24,25,26,27,28,29,30:
				System.out.println("Produto do Nordeste !");
				break;
			case 7,8,9:
				System.out.println("Produto do Sudeste !");
				break;
			case 10,11,12,13,14,15,16,17,18,19,20:
				System.out.println("Produto do Centro-Oeste !");
				break;
			default:
				System.out.println("Código inválido!");
		}
		SC.close();
	}
}


