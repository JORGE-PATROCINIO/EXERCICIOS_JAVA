
import java.util.Scanner;

public class ConjuntoValores {

	public static void main(String[] args) {
		
		float N1 = 1f;
		
		Scanner SC = new Scanner(System.in);
		
		while(N1 > 0) {
			
			System.out.println("Digite um número: ");
			N1 = SC.nextInt();
			
			if(N1==0) {
				System.out.println("Fim do Programa !");
			}else {
				System.out.println("O número desejado foi: " + N1 + "\n");
				System.out.println("Seu Quadrado é: " + Math.pow(N1, 2));
				System.out.println("Seu Cubo é: " + Math.pow(N1, 3));
				System.out.println("Seu Quadrado é: " + Math.sqrt(N1) + "\n");
			}
	}
		SC.close();
	}

}

