import java.util.Locale;
import java.util.Scanner;
public class PesoIdeal {

	public static void main(String[] args) {
		
		double PesoIdeal = 0d;
		Locale.setDefault(Locale.US);
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite 1 para feminino ou 2 para masculino: ");
		int Sexo = SC.nextInt();
		
		if(Sexo == 1 || Sexo == 2) {
		
			System.out.println("Digite a Altura: ");
			double Altura = SC.nextDouble();
			
			if(Sexo == 1) {
				 PesoIdeal = (double)((double)(62.1 * Altura) - 44.7);
			}else{
				 PesoIdeal = ((72.7 * Altura) - 58);
			}
			
			System.out.println("Peso ideal = " + PesoIdeal + "Kg");
		
		}else {
			System.out.println("Número do sexo inválido !");
		}
			
			SC.close();
	}

}
