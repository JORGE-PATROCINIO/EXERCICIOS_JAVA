import java.util.Scanner;
import java.text.DecimalFormat;

public class ComprasFrutas {

	public static void main(String[] args) {
		float Valor = 0f;
		
		Scanner SC= new Scanner(System.in);
		DecimalFormat Moeda = new DecimalFormat("$#,##0.00");
		
		System.out.println("Digite a quatidade de maçãs compradas: ");
		int Quantidade = SC.nextInt();
		
		if(Quantidade < 12) {
			 Valor = 0.3f;
		
		}else {
			 Valor = 0.25f;
		}
		
		float ValorTotal = Quantidade * Valor;
		
		System.out.println("O valor total da compra é de: " + Moeda.format(ValorTotal));
		
		SC.close();
	}

}
