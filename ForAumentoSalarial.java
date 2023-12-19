package ForAumentoSalarial;

import java.text.DecimalFormat;

public class ForAumentoSalarial {

	public static void main(String[] args) {
		
		
		
		 float salarioI = 0.0f;
		 float salario = 0.0f;
		 float taxa = 0.0f;
		 float aumento = 0.0f;
		 
		 DecimalFormat arredondar = new DecimalFormat("$#,##0.00");
		
		for(int ano = 2000 ; ano <= 2017 ; ano++){
			
			if(ano == 2000) {
				
				salarioI = 1000;
				System.out.println(ano + " SI: " + salarioI + " taxa (%): " + taxa + " aumento: "+ aumento + " salario Atual "+ salario + "\n");
				
			}else if(ano == 2001) {
				 System.out.println("Salário do ano anterior: " + arredondar.format( salarioI));
				taxa = 0.015f;
				aumento = salarioI*taxa;
				salario = aumento + salarioI;
				System.out.println(ano + " Salário atual: " + arredondar.format(salario) + " taxa(%): " + taxa + " aumento: "+ arredondar.format(aumento) +"\n");
				
			}else {
		        System.out.println("Salário do ano anterior: " + arredondar.format(aumento));
				aumento = salario*taxa;
				salario = aumento + salario;
				System.out.println(ano + " Salário atual: " + arredondar.format(salario) + " taxa(%): " + taxa + " aumento: "+ arredondar.format(aumento) + "\n");
				
			}
			taxa*=2; // taxa = taxa*2
			
		}

	}

}
