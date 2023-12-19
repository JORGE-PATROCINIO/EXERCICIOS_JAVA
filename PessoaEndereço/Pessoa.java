package PessoaEndereço;

public class Pessoa {
	// Atributos
	private String Nome;
	private int Idade;
	private char Sexo;
	private Endereço end;
	// Métodos de acesso(Public)
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		this.Idade = idade;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		this.Sexo = sexo;
	}
	public Endereço getEnd() {
		return end;
	}
	public void setEnd(Endereço end) {
		this.end = end;
	}
	
	// Métodos Especiais
	
	public Pessoa() {
		this.end = new Endereço();
	}
	public Pessoa(String Nome, int Idade, char Sexo) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.Sexo = Sexo;
		this.end = new Endereço();

	}
	public Pessoa(String Nome, int Idade, char Sexo, Endereço end) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.Sexo = Sexo;
		this.end = end;
	}
	
	public String imprimir() {
		return "Nome: " + Nome + "\nIdade: " + Idade + "\nSexo: " + Sexo + "\nEndereço: " + end.imprimir();
	}
}
