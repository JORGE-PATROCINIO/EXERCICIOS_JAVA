//Elimine os testes reduntantes do trecho de código abaixo: 

public class EliminandoRedundância {

	public static void main(String[] args) {
		int x =8,a=4,b=9;		
		/*
		 * A)
		 * se (a<b) entao
		 *   escreva("O maior é",a);
		 * senao
		 * 	 se (b >= a) então
		 * 		escreva("O maior é",b);
		 *   fimse
		 * fimse */
			if (a>b) {
				System.out.println("O maior é: " + b);
			}else {
				System.out.println("O maior é: " + a);
			}
			
		/* b)
		 * se(x>10) então                                    
		 * 		escreva("Valor maior do que 10");
		 * sanao 
		 * 		se( x<=10 && x > 5)então
		 * 			escreva("Menor ou igual a 10 e menor que 5");
		 * 		senao
		 * 			se(x <= 5)então
		 * 				escreva("Menor ou igual  5");
		 */
			if(x>10) {
				System.out.println(x + " é maior do que 10!");
			}else if(x > 5 && x <= 10) {
				System.out.println(x + " é maior do que 5 e menor ou igual a 10");
			}else {
				System.out.println(x + "é menor ou igual a 5");
			}
	}
}
