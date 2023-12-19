package app;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de livros!");
		int n = sc.nextInt();
		//vetores
		Livro livro[ ] = new Livro[n]; // livro = [{nome,autor},{nome,a]
		// livro = [{0},{}]
		for( int i=0;i<n;i++) {
			
			String nome = sc.nextLine();
			String autor = sc.nextLine();	
					
			livro[i]= new Livro(nome,autor); // 
			System.out.println(livro[i]);
		}
		//System.out.println(livro);
		
		
		sc.close();
	}

}
