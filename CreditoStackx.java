import java.util.Scanner;
import java.util.Locale;
public class CreditoStackx {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto:");
		float SalarioBruto = SC.nextFloat();
		
		System.out.println("Digite o valor do empréstimo:");
		float ValorEmprestimo = SC.nextFloat();		
		
		System.out.println("Digite o número de parcelas:");
		int NParcelas = SC.nextInt();
		
		float ValorParcela = (float)(ValorEmprestimo / NParcelas);
		float ValorMaxParcela = (float)(SalarioBruto * 0.3);
		
		if(ValorParcela <= ValorMaxParcela) {
			System.out.printf("Empréstimo Aprovado! O valor da parcela é de: %.2f%n",ValorParcela);
		}else {
			System.out.printf("Empréstimo não Aprovado! O valor máximo da sua Parcela é de: %.2f%n",ValorMaxParcela);
		}
		SC.close();
	}

}


