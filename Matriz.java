package Matriz;

public class Matriz {

	public static void main(String[] args) {
		
		int [][] array1 = new int [3][3];
		int array2 [][] = new int [3][2];
		int[] array3 [] = new int [3][2];	
		
		/*
		 * 1 2 3 
		 * 4 5 6 
		 * 7 8 9 
		*/
		
		// inserindo valores:  array[linha][coluna] 
		
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		array1[2][0] = 7;
		array1[2][1] = 8;
		array1[2][2] = 9;
		
		int array4[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		// TODO: imprimir array1.
		
		for(int linha = 0; linha < array1.length; linha++) {
			for(int coluna = 0; coluna < array1.length; coluna++) {
				
				System.out.print(array1[linha][coluna] + "\t");
			}
				System.out.println(); // para fazer uma quebra de linha.
		}
	}

}



