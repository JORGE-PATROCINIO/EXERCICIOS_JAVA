package ExeSwitchCase2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ExeSwitchCase2 {

	public static void main(String[] args) {
		
		char rept = 's';
		int Cod, Quantidade, ValorProduto = 0;
		float TotalNota = 0.0f,Desconto = 0.0f, NotaDesconto = 0.0f;
		
		DecimalFormat Money = new DecimalFormat("$#,##0.0");
		Scanner SC = new Scanner(System.in);
		
		while(rept == 's' || rept == 'S') {
			
			System.out.println("Digite o código do produto: ");
			Cod = SC.nextInt();
			System.out.println("Digite a quantidade de produtos:");
			Quantidade = SC.nextInt();
			
			switch(Cod) {
			
				case 1,2,3,4,5,6,7,8,9,10:
					
					ValorProduto = 10;
					TotalNota = Quantidade * ValorProduto;
					
					if(TotalNota <= 250) {
						
							Desconto = (float)(TotalNota * 0.05); // casting
							NotaDesconto = TotalNota - Desconto;
						}else {
							Desconto = 0;
							NotaDesconto = TotalNota;
							System.out.println("Sem desconto ! \n");
					}
					break;
				
				case 11,12,13,14,15,16,17,18,19,20:
					
					ValorProduto = 15;
					TotalNota = Quantidade * ValorProduto;
				
					if(TotalNota > 250 && TotalNota < 500) {
					
						Desconto = (float)(TotalNota * 0.1); // casting
						NotaDesconto = TotalNota - Desconto;
					}else {
						Desconto = 0;
						NotaDesconto = TotalNota;
						System.out.println("Sem desconto ! \n");
				}
				break;
				
				case 21,22,23,24,25,26,27,28,29,30:
					
					ValorProduto = 20;
					TotalNota = Quantidade * ValorProduto;
					
					if(TotalNota > 50) {
						
							Desconto = (float)(TotalNota * 0.15); // casting
							NotaDesconto = TotalNota - Desconto;
						}else {
							
							Desconto = 0;
							NotaDesconto = TotalNota;
							System.out.println("Sem desconto ! \n");
					}
					break;
				
				case 31,32,33,34,35,36,37,38,39,40:
					
					ValorProduto = 30;
					TotalNota = Quantidade * ValorProduto;
					Desconto = 0;
					NotaDesconto = TotalNota;
					
						System.out.println("Sem desconto ! \n");
					break;
				default:
					System.out.println("Digite um código válido !");
					System.out.println(" ");
					
			}
			System.out.println("O preco unitário do produto é: " + Money.format(ValorProduto));
			System.out.println("O Valor total da nota sem desconto é de: " + Money.format(TotalNota));
			System.out.println("O valor do desconto é de: " + Money.format(Desconto));
			System.out.println("O valor da nota depois do desconto é de: " + Money.format(NotaDesconto));
			System.out.println(" ");
			System.out.println("============================================================================ \n");
			System.out.println("Digite 'S' para repetir ou qualquer tecla para sair?");
			rept = SC.next().charAt(0);
		}
			System.out.println(" ");
			System.out.println("Fim da operação!");
			SC.close();
	}

}


