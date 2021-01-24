package tabuleiroDoJogo;

public class Peca {
	protected Posicao posicao; 
	private Tabuleiro tabuleiro;
	
	// a posição no inicio é nula, pois ainda não foi colocada no tabuleiro, logo não é colocada no construtor
// não precisa colocar no construtor a posicao por definição o java colocar null se não for colocada 
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	// da mesma forma iremos criar get e set só do tabuleiro

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	// o tabuleiro não será acessado pela camada de xadres
	// apenas as classes dentro do pacote e subclasse pode acessar, por isso protected
// retire o set, pois o tabuleiro não será modificado
	
	
	
		
	
	
		
	
}
