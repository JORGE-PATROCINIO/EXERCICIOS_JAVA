import java.util.Scanner;

public class ValoresEmOrdem {

	public static void main(String[] args) {
		
		int Maior = 0,Menor = 0,Meio = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Valor: ");
	    int Valor1 = SC.nextInt();
		
		System.out.println("Digite o segundo Valor: ");
		int Valor2 = SC.nextInt();
		
		System.out.println("Digite o terceiro Valor: ");
		int Valor3 = SC.nextInt();
		
		
		if(Valor1 > Valor2 && Valor1 > Valor3) {
			Maior = Valor1;
			if(Valor2 > Valor3) {
				Meio = Valor2;
				Menor = Valor3;
			}else {
				Meio = Valor3;
				Menor = Valor2;
			}
		}else if(Valor2 > Valor1 && Valor2 > Valor3) {
			Maior = Valor2;
					if(Valor1 > Valor3) {
						Meio = Valor1;
						Menor = Valor3;
					}else {
						Meio = Valor3;
						Menor = Valor1;
					}
			
		}else if(Valor3 > Valor2 && Valor3 > Valor1) {
			Maior = Valor3;
					if(Valor2 > Valor1) {
						Meio = Valor2;
						Menor = Valor1;
					}else {
						Meio = Valor1;
						Menor = Valor2;
					}
		}
		
		System.out.println("A ordem crescente dos números -> " + Menor + "-" + Meio + "-" + Maior);
		
		SC.close();
	}
}