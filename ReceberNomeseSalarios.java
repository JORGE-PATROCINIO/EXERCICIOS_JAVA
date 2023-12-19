import java.text.DecimalFormat;
import java.util.Scanner;

public class ReceberNomeseSalarios {

	public static void main(String[] args) {
		
		float RendimentoCarlos = 1f,RendimentoJoao = 0f;
		int Mes = 1;
		
		Scanner SC = new Scanner(System.in); 
		DecimalFormat Money = new DecimalFormat("$#,##0.00");
		
		System.out.println("Digite o Salário de Carlos:");
		float SalarioCarlos = SC.nextFloat();
		
		float SalarioJoao = SalarioCarlos/3; 
		
		while(RendimentoJoao < RendimentoCarlos){
			
			if(Mes == 1) {
				RendimentoCarlos = SalarioCarlos;
				RendimentoJoao = SalarioJoao;
			}else {
				RendimentoCarlos = (float)(RendimentoCarlos *(1 + 0.02)) + SalarioCarlos;
				RendimentoJoao = (float)(RendimentoJoao * (1 + 0.05) ) + SalarioJoao;
			}
		    System.out.println("Mês " + Mes);
		    System.out.println("Poupança Carlos = " + Money.format(RendimentoCarlos));
		    System.out.println("Poupança Joao = " + Money.format(RendimentoJoao));
		    Mes ++;
		}
		SC.close();
	}
}

