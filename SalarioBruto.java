import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		
		float Gratificacao = 0f;
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		float Salario = SC.nextFloat();
	
		
		if(Salario <= 350) {
			Gratificacao = 100;
		}else if(Salario > 350 && Salario <= 600) {
			Gratificacao = 75;
		}else if(Salario > 600 && Salario <= 900) {
			Gratificacao = 50;
		}else if(Salario > 900) {
			Gratificacao = 35;
		}
		
		float ValorReceber = Salario *(float)(1 - 0.07) + Gratificacao;
		
		System.out.println("O valor a receber é de: R$ " + ValorReceber);
		
		SC.close();
	}

}
