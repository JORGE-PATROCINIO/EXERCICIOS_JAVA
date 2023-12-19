import java.util.Locale;
import java.util.Scanner;
public class Receita {

	public static void main(String[] args) {
		
		float Dosagem = 0f;
		
		Locale.setDefault(Locale.US);
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o Peso do paciente:");
		float Peso = SC.nextFloat();
		
		System.out.println("Digite a idade do paciente:");
		float Idade = SC.nextFloat();
		
		if(Idade >= 12) {
			if(Peso >= 60) {
				Dosagem = 1000;
			}else {
				Dosagem = 875;
			}
		}else {
			if(Peso >= 5 && Peso <= 9) {
				Dosagem = 125;
			}else if(Peso > 9 && Peso <= 16) {
				Dosagem = 250;
			}else if(Peso > 16 && Peso <= 24) {
				Dosagem = 375;
			}else if(Peso > 24 && Peso <= 30) {
				Dosagem = 500;
			}else {
				Dosagem = 750;
			}	
		}
		int Gotas =(int)(20 * Dosagem)/500;
		
		System.out.printf("A Quantidade é de %d gotas%n", Gotas);
		SC.close();
	}		
}

