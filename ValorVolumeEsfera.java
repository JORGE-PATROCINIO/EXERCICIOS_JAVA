package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class ValorVolumeEsfera {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", PI);
		
		sc.close();
	}
	public static double volume(double raio) {
		return 2.0 * PI * raio;
	}
	public static double circunferencia(double raio) {
		return 4.0 * PI * raio * raio * raio/3.0;
	}
}
