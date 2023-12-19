package Tabuada;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja saber a tabuada:"); 
		
		int x = leitor.nextInt();
		 
		 for(int i=0; i <= 10; i++) {
			  
			 int tabuada = i * x;
			 
			 System.out.println(x + " x " + i + " = " + tabuada);
			 
		 }
		 leitor.close();
		

	}

} //
