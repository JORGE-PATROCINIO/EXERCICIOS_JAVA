package OperaçõesMat;

import java.util.Scanner;

public class operaçõesMat {

	public static void main(String[] args) {
		
		float diferenca;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro número: ");
		float N1 = SC.nextFloat();
		System.out.println("Digite o segundo número: ");
		float N2 = SC.nextFloat();
		
		System.out.println("Digite a operação desejada: \n");
		System.out.println("1 - Média");
		System.out.println("2 - Diferença do maior pelo menor");
		System.out.println("3 - Produto");
		System.out.println("4 - Divisão do número 1 pelo número 2");
		
		int OP = SC.nextInt();
		
		switch(OP) {
		
			case 1:
				float media = (N1 + N2)/2;
				System.out.println("A média é: " + media);
				break;
			case 2:
				if(N1 > N2) {
					  diferenca = N1 - N2;
					  System.out.println("A diferença é : " + diferenca);
				}else if (N2 > N1) {
					  diferenca = N2 - N1;
					  System.out.println("A diferença é : " + diferenca);
				}else {
					System.out.println("São iguais!");
				}
				break;
			case 3:
				float produto = N1 * N2;
				System.out.println("O produto entre os números é de: " + produto);
				break;
			case 4:
				float divisao = N1 / N2;
				System.out.println("O resultado da divisão é de: " + divisao);
				break;
		}
		SC.close();
		
	}

}
