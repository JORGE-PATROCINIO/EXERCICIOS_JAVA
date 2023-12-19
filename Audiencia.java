import java.util.Scanner;

public class Audiencia {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		int Canal =1,NPessoas,SomaPessoasC4=0,SomaPessoasC5 = 0,SomaPessoasC7 = 0,SomaPessoasC12 = 0,TotalPessoas=0;
		float PercentualC4,PercentualC5,PercentualC7,PercentualC12;
		
		do {
			
			System.out.println("Entre com o número do canal: ");
			Canal = SC.nextInt();
			
			if(Canal == 0) {
				System.out.println("Fim do Programa \n");
			
			}else if(Canal != 4 && Canal != 5 && Canal !=7 && Canal != 12){
				System.out.println("Canal inválido, fazem parte da pequisa somente os canais: 4,5,7 e 12 ou 0 para encerrar ! \n");
			
			}else {
				
				System.out.println("Digite o número de Pessoas: ");
				NPessoas = SC.nextInt();
				
				TotalPessoas = TotalPessoas + NPessoas;
				
				if(Canal == 4) {
					SomaPessoasC4 = SomaPessoasC4 + NPessoas;
					
				}else if(Canal == 5) {
					SomaPessoasC5= SomaPessoasC5 + NPessoas;
					
				}else if(Canal == 7) {
					SomaPessoasC7 = SomaPessoasC7 + NPessoas;
					
				}else if(Canal == 12) {
					SomaPessoasC12 = SomaPessoasC12 + NPessoas;
				}
			}
			
		}while(Canal != 0);
	
		PercentualC4 = (SomaPessoasC4*100)/TotalPessoas; 
		PercentualC5 = (SomaPessoasC5*100)/TotalPessoas; 
		PercentualC7 = (SomaPessoasC7*100)/TotalPessoas; 
		PercentualC12 = (SomaPessoasC12*100)/TotalPessoas; 
		
		System.out.println("Percentual de audiência do canal 4 é de: (%)" + PercentualC4);
		System.out.println("Percentual de audiência do canal 5 é de: (%)" + PercentualC5);
		System.out.println("Percentual de audiência do canal 7 é de: (%)" + PercentualC7);
		System.out.println("Percentual de audiência do canal 12 é de: (%)" + PercentualC12);
		
	SC.close();
	}
}




