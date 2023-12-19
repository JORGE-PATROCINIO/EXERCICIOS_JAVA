import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		
		float Maior;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float N1 = SC.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float N2 = SC.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		float N3 = SC.nextFloat();
		
		if(N1 > N2 && N1 > N3) {
			Maior = N1;
		}else if(N2 > N1 && N2 > N3) {
			Maior = N2;
		}else {
			Maior = N3;
		}
		System.out.println("O maior número é:" + Maior);
		SC.close();
	}

}
