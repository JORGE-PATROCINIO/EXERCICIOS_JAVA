package UECombat;

import java.util.Random;

public class Luta {
	// Atributos
	private Lutador Desafiado;
	private Lutador Desafiante;
	private int Rounds;
	private boolean Aprovada;
	
	// Métodos Públicos
	public void MarcarLuta(Lutador L1, Lutador L2){
		if(L1.getCategoria() == (L2.getCategoria()) && L1 != L2){
			this.Aprovada = true;
			this.Desafiado = L1;
			this.Desafiante = L2;
		} else{
			this.Aprovada = false;
			this.Desafiado = null;
			this.Desafiante = null;
		}
	}
	public void Lutar() {
		if(this.Aprovada) {
			System.out.println("###### DESAFIADO ######");
			this.Desafiado.Apresentar();
			System.out.println("##### DESAFIANTE ######");
			this.Desafiante.Apresentar();
			
			Random aleatório = new Random();
			
			int Vencedor = aleatório.nextInt(3); // 0 1 2 
			System.out.println("=========== RESULTADO DA LUTA ==========");
			switch(Vencedor) {
			case 0: // empate
				System.out.println("Empatou !!!");
				this.Desafiado.Empatarluta();
				this.Desafiante.Empatarluta();
				break;
			case 1: // Desafiado vence
				System.out.println("Vitória do " + this.Desafiado.getNome());
				this.Desafiado.GanharLuta();
				this.Desafiante.PerderLuta();
				break;
			case 2: // Desafiante vence
				System.out.println("Vitória do " + this.Desafiante.getNome());
				this.Desafiante.GanharLuta();
				this.Desafiado.PerderLuta();
				break;
			}
			System.out.println("===========================================");
			
		}else {
			System.out.println("A luta não pode acontecer !!!");
		}
		
	}
	
	// Métodos Especiais
	public Lutador getDesafiado() {
		return Desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.Desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return Desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.Desafiante = desafiante;
	}
	public int getRounds() {
		return Rounds;
	}
	public void setRounds(int rounds) {
		this.Rounds = rounds;
	}
	public boolean isAprovada() {
		return Aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.Aprovada = aprovada;
	}
	
}
