import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		float N1 = SC.nextFloat();
		
		System.out.println("Digite o primeiro número:");
		float N2 = SC.nextFloat();
		
		if(N1 > N2) {
			System.out.println("O número " + N1 + " é maior !");
		}else if(N2 > N1) {
			System.out.println("O número " + N2 + " é maior !");
		}else {
			System.out.println("Os números são iguais!");
		}
		
		SC.close();
	}

}
