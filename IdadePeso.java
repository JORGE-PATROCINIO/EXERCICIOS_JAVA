import java.util.Scanner;

public class IdadePeso {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float Peso = SC.nextFloat();
		
		System.out.println("Digite sua Idade: ");
		int Idade = SC.nextInt();
		
		if(Idade < 0){
		
			System.out.println("Idade inválida");
		
		}else if (Idade < 20) {
			if(Peso <= 60){
				System.out.println("Seu grupo de risco é: 9 !");
			}else if(Peso > 60 && Peso <= 90) {
				System.out.println("Seu grupo de risco é: 8 !");
			}else if (Peso > 90) {
				System.out.println("Seu grupo de risco é: 7 !");
			}
		
		}else if(Idade >= 20 && Idade <= 50) {
			if(Peso <= 60){
				System.out.println("Seu grupo de risco é: 6 !");
			}else if(Peso > 60 && Peso <= 90) {
				System.out.println("Seu grupo de risco é: 5 !");
			}else if (Peso > 90) {
				System.out.println("Seu grupo de risco é: 4 !");
			}
			
		}else {
			if(Peso <= 60){
				System.out.println("Seu grupo de risco é: 3 !");
			}else if(Peso > 60 && Peso <= 90) {
				System.out.println("Seu grupo de risco é: 2 !");
			}else if (Peso > 90) {
				System.out.println("Seu grupo de risco é: 1 !");
			}
			
		}
		SC.close();
	}

}
