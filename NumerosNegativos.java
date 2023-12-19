import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {

		int ContPositivo = 0,ContNegativo = 0,ContNulo = 0;
		float Valor1 = 0f,Valor2=0f,Valor3=0f;
		
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		 Valor1 = SC.nextFloat();
		
		System.out.println("Digite o primeiro número: ");
		 Valor2 = SC.nextFloat();
		
		System.out.println("Digite o primeiro número: ");
		 Valor3 = SC.nextFloat();

			if(Valor1 > 0) {
				ContPositivo ++;
			
			}else if(Valor1 < 0) {
				ContNegativo ++;
			
			}else {
				ContNulo ++;
			}
			
			if(Valor2 > 0) {
				ContPositivo ++;
			
			}else if(Valor2 < 0) {
				ContNegativo ++;
			
			}else {
				ContNulo ++;
			}
			
			if(Valor3 > 0) {
				ContPositivo ++;
			
			}else if(Valor3 < 0) {
				ContNegativo ++;
			
			}else {
				ContNulo ++;
			}
			
			System.out.println(" Números negativos: " + ContNegativo + "\n Números Positivos: " + ContPositivo + "\n Números nulos: " + ContNulo);
		SC.close();
	}

}

