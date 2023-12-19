import java.util.Scanner;
import java.util.Locale;

public class CarroNovo {

	public static void main(String[] args) {
		
		float TaxaDistribuidor = 0f,Imposto = 0f;
		
		Locale.setDefault(Locale.US);
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o preço de fábrica:");
		float CustoFabrica = SC.nextFloat();
		
		if(CustoFabrica <= 12000) {
			TaxaDistribuidor = (float)0.05;
			Imposto = 0;
		
		}else if(CustoFabrica > 12000 && CustoFabrica <= 25000) {
			TaxaDistribuidor =(float) 0.1;
			Imposto = (float)0.15;
		
		}else {
			TaxaDistribuidor = (float)0.15;
			Imposto = (float)0.2;
		}
		
		float CustoConsumidor = CustoFabrica *(1 + TaxaDistribuidor + Imposto);
		
		System.out.printf("Preço de revenda = %.2f%n",CustoConsumidor);
		SC.close();
	}

}

