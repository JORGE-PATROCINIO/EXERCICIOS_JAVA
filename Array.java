package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		
// OBS: LISTA É DIFERENTE DE ARRAY(ARRANJO OU VETOR)!!!
/*lista é uma interface, significa que ela não pode ser estanciada, devemos usar uma classe como um: Arraylist, 
 ela não pode ser definida como tipos primitivos, devemos usar(Interger,String)*/
		
		List<String> list = new ArrayList<>(); //  lista só contém elementos do mesmo tipo.
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Impostor"); // foi adicionado na posição 2,os demais se ajustaram automáticamente !
		
		System.out.println(list.size()); // mostra o tamanho da lista !

		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println("--------------------------------------");
		
		list.remove("Anna"); // remove pela conteúdo !
		list.remove(0); // remove pela posição do elemento !
		System.out.println(list.size()); // mostra o tamanho da lista !
		System.out.println(list);
		
		System.out.println("---------------------------------------");
		
		list.removeIf(nome -> nome.charAt(0) == 'A'); // função lambda !
		
		System.out.println(list);
		
		System.out.println("------------------------------------------");
		System.out.println("Index of Bob:" + list.indexOf("Bob")); // mostra a posição do elemento na lista !
		
		List<String>result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());
		// retorna uma nova lista com o resultado filtrado da lista list!
		System.out.println(result);
		
		System.out.println("----------------------------------------------");
		
		String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null); 
		// encontra o primeiro elemento da lista com a letra A!
		System.out.println(name);
	}

}

