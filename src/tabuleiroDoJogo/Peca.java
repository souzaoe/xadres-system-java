package tabuleiroDoJogo;

public class Peca {
	protected Posicao posicao; 
	private Tabuleiro tabuleiro;
	
	// a posi��o no inicio � nula, pois ainda n�o foi colocada no tabuleiro, logo n�o � colocada no construtor
// n�o precisa colocar no construtor a posicao por defini��o o java colocar null se n�o for colocada 
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	// da mesma forma iremos criar get e set s� do tabuleiro

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	// o tabuleiro n�o ser� acessado pela camada de xadres
	// apenas as classes dentro do pacote e subclasse pode acessar, por isso protected
// retire o set, pois o tabuleiro n�o ser� modificado
	
	
	
		
	
	
		
	
}
