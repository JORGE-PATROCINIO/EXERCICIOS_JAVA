import java.util.Scanner;
public class MediaFinal {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		float Nota1 = SC.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float Nota2 = SC.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		float Nota3 = SC.nextFloat();
		
		System.out.println("Digite número de aulas ministradas:");
		int TotalAulas = SC.nextInt();
		
		System.out.println("Digite o número de faltas:");
		int Faltas = SC.nextInt();
		
		float Media = (Nota1 + Nota2 + Nota3)/ 3;
		float PercentualFaltas = (Faltas*100)/TotalAulas;
		
		if(PercentualFaltas <= 25) {
			
			if(Media < 3) {
				System.out.println("Reprovado ! Media = " + Media);
			}else if (Media >= 3 && Media < 7) {
				System.out.println("Recuperação ! Media = " + Media);
			}else {
				System.out.println("Aprovado ! Media = " + Media);
			}
		}else{
			System.out.println("Reprovado por falta !" );
		}
		SC.close();
	}
}
