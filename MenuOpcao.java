import java.util.Scanner;

public class MenuOpcao {

	public static void main(String[] args) {
		
		double Salario = 0,Imposto=0,Aumento =0;
		int OP;
		boolean sair = true;
		
		Scanner SC = new Scanner(System.in);
	do {
		System.out.println(" ");
		System.out.println("Digite a opção desejada: ");
		System.out.println("1- Impostos");
		System.out.println("2- Novo Salário");
		System.out.println("3- Classificação");
		System.out.println("4 ou 5 para sair");
		
		 OP = SC.nextInt();
		
		 if(OP < 0 || OP > 5) {
			 System.out.println("Digite uma opção válida !");
		
		 }else if(OP==4||OP==5){ 
			    System.out.println("Obrigado por usar o sistema !!!");
				sair=false;
		 }else {
				  System.out.println("Digite o salário: ");
				  Salario = SC.nextDouble();
			
				  if(OP == 1) {
						if(Salario < 500) {
							Imposto = Salario * 0.05;
						}else if(Salario >= 500 && Salario <= 850) {
							Imposto = Salario *0.1;
						}else if(Salario > 850) {
							Imposto = Salario * 0.15;
						}
				
						System.out.println("O valor do imposto é de: R$ " + Imposto);
		
				  }else if(OP==2) {
	
						if(Salario > 1500) {
							Aumento = 250;
						}else if(Salario >= 750 && Salario <= 1500) {
							Aumento = 50;
						}else if(Salario >= 450 && Salario < 750) {
							Aumento = 75;
						}else if(Salario < 450) {
							Aumento = 100;
						}
						System.out.println("O novo salário com aumento é de: R$ " + (Salario + Aumento));
				  }else if(OP==3) {
			
						if(Salario <= 700) {
							System.out.println("Mal remunerado !!!");
						}else {
							System.out.println("Bem remunerado !!!");
						}
				  }
		  }
		 
			
		}while(sair == true);
		SC.close();
	}

}

