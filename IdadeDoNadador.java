import java.util.Scanner;

public class IdadeDoNadador {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador: ");
		int Idade = SC.nextInt();
		
		if(Idade < 5) {
			System.out.println("Não existe categoria para essa idade !");
		}else if(Idade >= 5 && Idade <= 7) {
			System.out.println("Categoria Infantil !");
		}else if(Idade >= 8 && Idade <= 10) {
			System.out.println("Categoria Juvenil !");
		}else if(Idade >= 11 && Idade <= 15) {
			System.out.println("Categoria Adolescente !");
		}else if(Idade >= 16 && Idade <= 30) {
			System.out.println("Categoria Adulto !");
		}else if(Idade > 30) {
			System.out.println("Categoria Sênior !");
		}
		SC.close();
	}
	

}

