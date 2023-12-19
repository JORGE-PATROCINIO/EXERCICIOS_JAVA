import java.util.Scanner;
public class MultiploDe3 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é multiplo de 3: ");
		int x = SC.nextInt();
		
		if (x % 3 == 0) {
			System.out.println("É multiplo de 3 !");
		}else {
			System.out.println("Não é multiplo de 3 !");
		}
		
		SC.close();
	}

}
