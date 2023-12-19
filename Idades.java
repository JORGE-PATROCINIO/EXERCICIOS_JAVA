
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		
		int Idade=1,Contador=1,Soma=0; 
		float Media; 
		boolean REP = false;
		
		
		Scanner SC = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite a idade: ");
			Idade = SC.nextInt(); 
			
			if(Idade == 0) {
				
				System.out.println("Até a próxima !!!");
				REP = !REP;
			}else {
				
				Soma = Soma + Idade;
				Media =(float) Soma / Contador; // casting
				Contador ++;
				System.out.println("===================================================");
				System.out.println("");
				System.out.println("A média é igual a: " + Media);
				System.out.println("");
				System.out.println("===================================================");
			}
		}while(REP == false);
		
	   SC.close();
	}
}



