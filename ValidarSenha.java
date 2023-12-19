import java.util.Scanner;

public class ValidarSenha {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int Senha = SC.nextInt();
		
		if(Senha == 1234) {
			System.out.println("Acesso Permitido !");
		}else {
			System.out.println("Acesso Negado !");
		}
		
		SC.close();
	}

}
