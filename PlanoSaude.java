import java.util.Scanner;
public class PlanoSaude {

	public static void main(String[] args) {
		
		float Valor = 0f;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int Idade = SC.nextInt();
		
		if(Idade <= 10) {
			Valor = 30;
		}else if(Idade > 10 && Idade <= 29) {
			Valor = 60;
		}else if(Idade > 29 && Idade <= 45) {
			Valor = 120;
		}else if(Idade > 45 && Idade <= 59) {
			Valor = 150;
		}else if(Idade > 59 && Idade <= 65) {
			Valor = 250;
		}else {
			Valor = 400;
		}
		System.out.println("O valor do plano para essa faixa de idade é de : " + Valor);
	  SC.close();	
	}

}
