package PrecoDeProdutp;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PrecoDeProduto {

	public static void main(String[] args) {
		
		double Imposto = 0.0d;
		double NovoPreco = 0.0d;
		float PrecoAumento=0f,Preco = 0f;  //    double some o erro
		
		DecimalFormat arredondar = new DecimalFormat("$#,##0.00");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a categoria: ");
		int Categoria = input.nextInt();
		
		System.out.println("Digite o Preço: ");
				Preco = input.nextFloat();
		
		switch(Categoria){
		
		case 1:
			if( Preco <= 25) {
				 PrecoAumento = (float)(Preco * 1.05);
			     NovoPreco = PrecoAumento * (1 - Imposto); 
			}else if ( Preco > 25) {
				PrecoAumento = (float)(Preco * 1.12);
			    NovoPreco = PrecoAumento * (1 - Imposto);
			}
			
			if (NovoPreco <= 50) {
				System.out.println("Barato !!!");
		    }else if(NovoPreco > 50 && NovoPreco < 120) {
		    	System.out.println("Normal !!!");
		    }else {
		    	System.out.println("Caro !!!");
		    }
			break;
		case 2:
			Imposto = 0.05;
			if( Preco <= 25) {
				 PrecoAumento = (float)(Preco * 1.08);
			     NovoPreco = PrecoAumento * (1 - Imposto);
			}else if ( Preco > 25) {
				PrecoAumento = (float)(Preco * 1.15);
			    NovoPreco = PrecoAumento * (1 - Imposto);
			}
			
			if (NovoPreco <= 50) {
				System.out.println("Barato !!!");
		    }else if(NovoPreco > 50 && NovoPreco < 120) {
		    	System.out.println("Normal !!!");
		    }else {
		    	System.out.println("Caro !!!");
		    }
			break;
		case 3:
			if( Preco <= 25) {
				 PrecoAumento = (float)(Preco * 1.10);
			     NovoPreco = PrecoAumento * (1 - Imposto);
			}else if ( Preco > 25) {
				PrecoAumento = (float)(Preco * 1.18);
			    NovoPreco = PrecoAumento * (1 - Imposto);
			}
			
			if (NovoPreco <= 50) {
				System.out.println("Barato !!!");
		    }else if(NovoPreco > 50 && NovoPreco < 120) {
		    	System.out.println("Normal !!!");
		    }else {
		    	System.out.println("Caro !!!");
		    }
			break;
		default:
			System.out.println("Categoria Inválida !!!");
		
		}if(Categoria == 1 || Categoria == 2 || Categoria == 3) {
		System.out.println("Preco com aumento é = " + arredondar.format(PrecoAumento));
		System.out.println("O valor do imposto é = % " + Imposto);
		System.out.println("O novo  preço é = " + arredondar.format(NovoPreco));
		}
		input.close();	
	}
}
