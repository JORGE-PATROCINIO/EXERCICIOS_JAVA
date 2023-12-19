package Application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Triangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triângulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triângulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
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
