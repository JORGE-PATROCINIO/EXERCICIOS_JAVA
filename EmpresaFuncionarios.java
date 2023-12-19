import java.util.Scanner;
import java.text.DecimalFormat;

public class EmpresaFuncionarios {

	public static void main(String[] args) {
		
		char Categoria =' ', Turno =' ';
		boolean Validacao = true;
		float ValorHora = 0f, SalarioInicial = 0f, AuxAlimentacao = 0f;
		int Contador = 1;
		
		Scanner SC = new Scanner(System.in);
		DecimalFormat Money = new DecimalFormat("$#,##0.00");
		
		System.out.println("Digite a quantidade de funcionários:");
		int TotalFuncionario = SC.nextInt();
		
		while(Contador <= TotalFuncionario) {
		
				System.out.println("Digite o código do funcionário: ");
				int Cod = SC.nextInt();
				
				System.out.println("Digite o número de horas trabalhadas: ");
				int HoraTrabalhada = SC.nextInt();
						
				while(Validacao) {
				
					System.out.println("Digite o Turno do funcionário: ");
					Turno = SC.next().charAt(0);
					
					if(Turno == 'M' || Turno == 'm' || Turno == 'N' ||Turno == 'n' || Turno == 'v' || Turno == 'V' ) {
				
						while(Validacao) {
							System.out.println("Digite a categoria do funcionário: ");
						    Categoria = SC.next().charAt(0);	
							
							if(Categoria == 'o' || Categoria == 'O' || Categoria == 'G' || Categoria == 'g') {
								Validacao = false;
							}else {
								System.out.println("Digite uma Categoria válida ! (G ou O)\n");
							}
						}	
					
					}else {
						System.out.println("Digite um turno válido ! (M,N ou V\n");
					
					}
				}
				Validacao = true;// para que o próximo funcionário possa entrar no loop de turno e categoria
				
				// aqui termina a validação da cetegoria e turno ################
				
				if(Categoria == 'g' || Categoria == 'G') {
					
					if(Turno == 'n' || Turno == 'N') {
						
						ValorHora = (float) (450 * 0.18);
						
					}else {
						
						ValorHora =(float)(450 * 0.15);
					}
					
				}else {
					
					if(Turno == 'n' || Turno == 'N') {
						
						ValorHora = (float)(450 * 0.13);
						
					}else {
						
						ValorHora = (float)(450 * 0.1);
						
					}
					
				} //  aqui termina o cálculo da hora trabalhada
				
				SalarioInicial = HoraTrabalhada * ValorHora;
				
				if(SalarioInicial <= 300) {
					AuxAlimentacao = (float)(SalarioInicial * 0.2);
				
				}else if(SalarioInicial > 300 && SalarioInicial <= 600) {
					AuxAlimentacao =  (float)(SalarioInicial * 0.15);
				
				}else {
					AuxAlimentacao = (float)(SalarioInicial * 0.05);
				}
				
				System.out.println("O código do funcionário é : " + Cod);
				System.out.println("O valor da sua hora trabalhada é de: " + Money.format(ValorHora));
				System.out.println("Número de horas trabalhadas = " + HoraTrabalhada);
				System.out.println("Salário inicial = " + Money.format(SalarioInicial));
				System.out.println("Auxilio Alimentação = " + Money.format(AuxAlimentacao));
				System.out.println("Salário Final = " + Money.format(SalarioInicial + AuxAlimentacao));
			    Contador++;
	}
	 SC.close();
	}

}

