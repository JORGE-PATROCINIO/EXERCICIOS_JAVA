
import java.util.Scanner;

public class Estatistica {

	public static void main(String[] args) {
		
		
		int   CidadeMaiorIndice = 0;
		int   CidadeMenorIndice = 0;
		int   TotalVeiculos = 0;
		float MediaVeiculos = 0.0f;
		float MediaAcidentes = 0.0f;
		int   CidadesMenorNVeiculos = 0;
		int   SomaAcidentes = 0;
		float MaiorIndice = 0f;
		float MenorIndice = 0f;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=1;i<6;i++) {
			
			System.out.println("Digite o código da cidade " + i + " :");
			int CodCidade = input.nextInt();
		
			System.out.println("Digite o número de veículos de passeio da cidade " + i + " :");
			int NumVeiculos = input.nextInt();
		 
			System.out.println("Digite o número de acidentes de trânsito com vítimas da cidade " + i + " :");
			int NumAcidentes = input.nextInt();
			
			float Indice = (float)NumAcidentes / NumVeiculos;
		 
			if( i == 1) {
				
				 MaiorIndice = Indice;
				 MenorIndice = Indice;
			}else {
				
				if(Indice > MaiorIndice) {
					 MaiorIndice = Indice;
					 CidadeMaiorIndice = CodCidade;
					
				}else if(Indice < MenorIndice) {
					MenorIndice = Indice;
					CidadeMenorIndice = CodCidade;
				}
			}if(NumVeiculos < 2000) {
				CidadesMenorNVeiculos = CidadesMenorNVeiculos + 1;
				SomaAcidentes = NumAcidentes + SomaAcidentes;
				MediaAcidentes = SomaAcidentes / CidadesMenorNVeiculos;
			}
			TotalVeiculos = NumVeiculos + TotalVeiculos;
			MediaVeiculos = TotalVeiculos / i;
	    }
		
		System.out.printf("O maior índice é de : %.2f e pertence a cidade: %d%n",MaiorIndice,CidadeMaiorIndice);
		System.out.printf("O menor índice é de : %.2f e pertence a cidade: %d%n ",MenorIndice,CidadeMenorIndice);
		System.out.println("A média de veículos de todas as cidades é de: " + MediaVeiculos);
		System.out.println("A média de acidentes de trânsito em cidades com menos de 2000 veículos é: " + MediaAcidentes);
		
		input.close();
	}
}


