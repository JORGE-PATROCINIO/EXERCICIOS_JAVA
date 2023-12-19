//Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.

import java.util.Locale;
import java.util.Scanner;
public class TrianguloAngulos {

	public static void main(String[] args) {
		
		float Valor1 = 0f,Valor2 = 0f,Valor3 = 0f;
		
		Locale.setDefault(Locale.US);                // Padrão americano de casas decimais;
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro ângulo: ");
		Valor1 = SC.nextFloat();
		
		System.out.println("Entre com o segundo ângulo: ");
		Valor2 = SC.nextFloat();
		
		System.out.println("Entre com o terceiro ângulo: ");
		Valor3 = SC.nextFloat();
		
		float Total = Valor1+Valor2+Valor3;
		
		if(Total != 180) {
			System.out.println("Valores inválidos !");
		}
		else{
			if(Valor1 == 90 || Valor2 == 90 || Valor3 == 90) {
				System.out.println("É um triângulo Retângulo !");
			}else if(Valor1 > 90 || Valor2 > 90 || Valor3 > 90) {
				System.out.println("É um triângulo Obtusângulo !");
			}else {
				System.out.println("É um triângulo Acutângulo !");
			}
		}
		SC.close();
	}
}


