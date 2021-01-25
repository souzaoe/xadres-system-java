package tabuleiroDoJogo;

public class Tabuleiro {
	
	private int linhas; 
	private int colunas;
	private Peca[][] pecas;
	
	// a matriz não é criada automaticamente no construtor
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; 
	}
	
	// criar os gats e sets automatico, somente das colunas e linhas, as pecas não serão criadas no automatico

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	} 
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna]; 
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca( Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao; 		
	}
	

}
