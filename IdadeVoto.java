import java.util.Scanner;

public class IdadeVoto {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int AnoAtual = SC.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		int AnoNascimento = SC.nextInt();
		
		int Idade = AnoAtual - AnoNascimento;
		
		if(Idade >= 18 && Idade <= 70) {
			System.out.println("Seu voto é obigatório!");
		
		}else if(Idade == 16 || Idade == 17 || Idade > 70) {
			System.out.println("Seu voto é facultativo!");
			
		}else {
			System.out.println(" Você não pode votar esse ano!");
			
		}
		
		SC.close();
	}

}


