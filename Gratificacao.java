import java.util.Scanner;

public class Gratificacao {  // considerando apenas horas completas.

	public static void main(String[] args) {
		
		int HoraExtra,HoraFalta;
		float HoraBonus=0f,Premio = 0f;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o número de horas extras: ");
		HoraExtra = SC.nextInt();
		
		System.out.println("Digite o número de horas faltadas: ");
		HoraFalta = SC.nextInt();
		
		HoraBonus =(HoraExtra-(float)2/3*(HoraFalta))*60;
		 
		 if(HoraBonus < 600) {
			 Premio = 100;
			 
		 }else if(HoraBonus >= 600 && HoraBonus <= 1200 ) {
			 Premio = 200;
		
		 }else if(HoraBonus > 1200 && HoraBonus <= 1800 ) {
			 Premio = 300;
		
		 }else if(HoraBonus > 1800 && HoraBonus <= 2400 ) {
			 Premio = 400;
		
		 }else {
			 Premio = 500;
		 }
		
		System.out.println("O valor do prêmio é = " + Premio);
		SC.close();
	}
}


