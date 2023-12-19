import java.util.Scanner;
import java.util.Locale;

public class Endocrino {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o peso:");
		float Peso = SC.nextFloat();
		
		System.out.println("Digite a altura:");
		float Altura = SC.nextFloat();
		
		float IMC =(float) (Peso / Math.pow(Altura,2));
		
		if(IMC < 20) {
			System.out.println("Abaixo do Peso !");
		}else if(IMC >= 20 && IMC <= 25) {
			System.out.println("Peso Normal !");
		}else if(IMC > 25 && IMC <= 30) {
			System.out.println("Excesso de Peso !");
		}else if(IMC > 30 && IMC <= 35) {
			System.out.println("Obesidade !");
		}else {
			System.out.println("Obesidade mórbida !");
		}
		SC.close();
	}

}
