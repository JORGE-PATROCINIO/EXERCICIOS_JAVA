import java.util.Scanner;

public class IdPoligono { 

	public static void main(String[] args) {  
		
		float Area;
	
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite os números de lados do polígono regular:");
		int NLados = SC.nextInt();
		
		if(NLados < 3) {
			System.out.println("Não é um Polígono !");
		}else if(NLados == 3 || NLados == 4){
			System.out.println("Digite a medida do lado em cm: ");
			float Medida = SC.nextFloat();
			
			if(NLados == 3) {
				Area = (float)((Math.pow(Medida, 2) * Math.sqrt(3))/4);
				System.out.println("É um triângulo equilátero de área = " + Area +"cm² !");
			}else{
				Area = (float)Math.pow(Medida, 2) ;
				System.out.println("É um quadrado de área = " + Area +"cm² !");
			}
		}else if(NLados == 5) {
			System.out.println("É um pentágono !");
		}else{
			System.out.println("Polígono não identificado !");
		}
		SC.close();
	}	
}




