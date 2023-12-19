
import java.util.Scanner;
public class Divisao3e7 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é multiplo de 3: ");
		int x = SC.nextInt();
		
		if (x % 3 == 0 && x % 7 == 0) {
			System.out.println("É divisível por 3 e 7 !");
		}else {
			System.out.println("Não é divisível por 3 ou por 7!");
		}
		
		SC.close();
	}

}