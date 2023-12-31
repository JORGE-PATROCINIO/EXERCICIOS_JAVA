import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA,xB,xC,yA,yB,yC;
		
		System.out.println("Entre com as medidas do triângulo x:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Entre com as medidas do triângulo y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areax = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		p = (yA + yB + yC) / 2.0;
		double areay = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triângulo x área: %.4f%n",areax);
		System.out.printf("Triângulo y área: %.4f%n",areay);
		
		if(areax > areay) {
			System.out.println("Triângulo x possui a maior área !");
		}
		else {
			System.out.println("Triângulo y possui a maior área !");
		}

	sc.close();
	}

}
