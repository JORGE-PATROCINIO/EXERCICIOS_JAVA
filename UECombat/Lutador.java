package UECombat;

public class Lutador {
	//Atributos
	private String Nome, Nacionalidade, Categoria;
	private int Idade,Vitorias, Derrotas, Empates;
	private double Peso, Altura;
	
	
	// Métodos Públicos
	public void Apresentar() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Chegou a hora ! Apresentamos o lutador " + this.getNome());   // ordem de leitura do codigo acessa o get e set antes de fazer a leitura!
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " Anos e " + this.getAltura() + "m" );
		System.out.println("Pesando " + this.getPeso() + "KG");
		System.out.println(this.getVitorias() + " vitórias !");
		System.out.println(this.getDerrotas() + " Derrotas !");
		System.out.println(this.getEmpates() + " Empates !");
		
	}
	public void Status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());  
		System.out.println("Ganhou " + this.getVitorias() + " vezes !");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes !");
		System.out.println("Empatou " + this.getEmpates() + " vezes !");
		

		
	}
	public void GanharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void PerderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void Empatarluta() {
		this.setEmpates(this.getEmpates()+1);
	}
	//Métodos Especiais
	public Lutador(String Nome, String Nacionalidade, int Idade, double Altura, double Peso, int Vitorias, int Derrotas, int Empates) {
		
		this.Nome = Nome;
		this.Nacionalidade = Nacionalidade;
		this.Idade = Idade;
		this.Altura = Altura;
		this.setPeso(Peso);
		this.Vitorias = Vitorias;
		this.Derrotas = Derrotas;
		this.Empates = Empates;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getNacionalidade() {
		return Nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.Nacionalidade = nacionalidade;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria() {
		if(this.Peso < 52.2) {
			this.Categoria = "Inválido";
		}else if(this.Peso <= 70.3) {
			this.Categoria = "Leve";
		}else if(this.Peso <= 83.9) {
			this.Categoria = "Médio";
		}else if(this.Peso <= 120.2) {
			this.Categoria = "Pesado";
		}else {
			this.Categoria = "Inválido";
		}
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		this.Idade = idade;
	}
	public int getVitorias() {
		return Vitorias;
	}
	public void setVitorias(int vitorias) {
		this.Vitorias = vitorias;
	}
	public int getDerrotas() {
		return Derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.Derrotas = derrotas;
	}
	public int getEmpates() {
		return Empates;
	}
	public void setEmpates(int empates) {
		this.Empates = empates;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		this.Peso = peso;
		this.setCategoria();
		
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		this.Altura = altura;
	}
}
    
