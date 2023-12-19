package PessoaEndereço;

import java.util.Scanner;
public class PessoaEndereço {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		Scanner SC2 = new Scanner(System.in);
		
		char RESP;
		// Objeto Pessoa e Endereço
		Pessoa p = new Pessoa();
		Endereço end = new Endereço();
		//  DADOS DA PESSOA
		System.out.println("Digite o nome: ");
		p.setNome(SC2.nextLine());
		System.out.println("Digite a idade: ");
		p.setIdade(SC.nextInt());
		System.out.println("Digite o sexo (f/m): ");
		p.setSexo(SC.next().charAt(0));
		// DADOS DO ENDEREÇO
		System.out.println("Digite seu endereço: ");
		end.setLogradouro(SC2.nextLine());
		System.out.println("Digite o número: ");
		end.setNumero(SC.nextInt());
		System.out.println("Tem complemento? (s/n): ");
		RESP = SC.next().charAt(0);
		
		if(RESP == 's'|| RESP == 'S') {
			System.out.println("Digite o complemento: ");
			end.setComplemento(SC2.nextLine());
		}else {
			end.setComplemento("");
		}
		System.out.println("Digite o CEP: ");
		end.setCEP(SC2.nextLine());
		
		// ASSOCIAÇÃO ENTRE PESSOA E ENDEREÇO
		
		p.setEnd(end);
		
		
		System.out.println("Dados da Pessoa: " + p.imprimir());
		SC.close();
		SC2.close();
	}

}
