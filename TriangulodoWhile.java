package TrianguloDoWhile;

import java.util.Scanner;

public class TriangulodoWhile {

	public static void main(String[] args) {
		
		float Base=1,Altura=1,Area=1;
		boolean verificacao = true;
		
		Scanner SC = new Scanner(System.in);
		
		do {
			System.out.println("Digite a medida da Base: ");
			Base = SC.nextFloat();
			if(Base > 0) {
				System.out.println("Digite a medida da Altura: ");
				Altura = SC.nextFloat();
				if(Altura > 0) {
					Area = (Base * Altura)/2;
					System.out.println("Área igual à: " + Area + " m² !");
				}else {
					System.out.println("Digite uma medida maior que zero!");
					verificacao = false;
				}
			}else {
				System.out.println("Digite uma medida maior que zero!");
				verificacao = false;
			}
			}while(verificacao == true);
		SC.close();
	}

}
