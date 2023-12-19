package PessoaEndereço;

public class Endereço {
	
		// Atributos
	
	private String Logradouro, Complemento, CEP;
	private int Numero;
	
		// Métodos de acesso(públicos)
	
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.Logradouro = logradouro;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		this.Complemento = complemento;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cep) {
		this.CEP = cep;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		this.Numero = numero;
	}
	
	public String imprimir() {
		return Logradouro + ", " + Numero + "\nComplemento: " + Complemento + "\nCEP: " + CEP;
	}
		

}
