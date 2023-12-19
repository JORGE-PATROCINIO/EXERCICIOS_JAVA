package Excecoes;

public class Excecoes {

	public static void main(String[] args) {
		
		try {
			int a = 10;											//para um try pode ter varios catch
			int b = 1;
			
			int c = a / b;
		}catch(ArithmeticException e) {
			
			System.out.println("Erro de Divisão por zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Erro, esse indice não existe!");
		}
		
		finally {                                             // continuar o código após os tratamentos de erros
			System.out.println("fim do código");  
		}
		

	}

}
