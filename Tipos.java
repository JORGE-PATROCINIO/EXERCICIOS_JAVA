package aula_1;

public class main {

	public static void main(String[] args) {
		System.out.println("ola,mundo!");
		
		/** INTEIROS */
		
		// TAMANHO: 1 BYTE (8 BITS)
		
		byte byteMin = -128;
		byte bytemax = 127;  // se o valor da variavel ultrapassar o maxn, ela retorna p valor minimo.
		
		// TAMANHO: 2 bytes
		
		short shortMin = -32768;
		short shortMax = 32767;
		
		// TAMANHO: 4 bytes
		
		int intMin = - 2147483648;
		int intMax = 2_147_483_647;
		
		// TAMANHO: 8 bytes
		
		long longMin = -9223372036854775808L; // l or L
		long longMax = Long.MAX_VALUE;
		
		/** REAIS */
		
		// precisão de até 7 casas decimais
		// tamanho: 4 bytes
		
		float a = 9.88f;
		float b = 9.88F;
		float c = (float)1.1234567;
		float d = (float)123.12345;
		
		// precisão de até 16 casas decimais
		// tamanho: 8 bytes
		
		double saldo = 1.30;
		double debito = 978.65;
		
		/** LÓGICO */ 
		
		//tamanho: 1 bit
		boolean javaEhDivertido = true;
		boolean javaEhChato = false;
		
		// expressões booleanas
		
		short idade = 47;
		boolean ehadulto = idade >= 18; //true
		boolean ehcrianca = idade <= 12; // false
		
		/** CARACTERE */
		
		// tamanho 2 bytes
		
		char tipoDaCNH = 'A';
		// char tipoDaCNH = 'B';
		// char tipoDaCNH = 'c';
		
		
	}

}
