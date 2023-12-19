
//Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.

import java.util.Scanner;
public class IdadeCompleta {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o ano atual:");
		int AnoAtual = SC.nextInt();
		
		System.out.println("Digite o mês atual:");
		int MesAtual = SC.nextInt();
		
		System.out.println("Digite o Ano de nascimento:");
		int AnoNasc = SC.nextInt();
		
		System.out.println("Digite o mês de nascimento:");
		int MesNasc = SC.nextInt();
		
		int Idade = AnoAtual - AnoNasc;
		
		if(MesAtual < 0 || MesAtual > 12 || MesNasc < 0 || MesNasc > 12){
			System.out.println("Mês inválido !");
		}else if(MesAtual >= MesNasc) {
			System.out.println("Sua idade é: " + Idade);
		}else {
			System.out.println("Sua Idade é: " + (Idade - 1) + ",nesse mesmo ano você completa " + Idade);
		}
		SC.close();
	}

}
