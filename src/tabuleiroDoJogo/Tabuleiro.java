package tabuleiroDoJogo;

public class Tabuleiro {
	
	private int linhas; 
	private int colunas;
	private Peca[][] pecas;
	
	// a matriz n�o � criada automaticamente no construtor
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcecaoTabuleiro("Erro ao criar o tabuleiro: necess�rio ter ao menos 1 linha e 1 coluna"); 
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; 
	}
	
	// criar os gats e sets automatico, somente das colunas e linhas, as pecas n�o ser�o criadas no automatico

	public int getLinhas() {
		return linhas;
	}	

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new ExcecaoTabuleiro("Posicao n�o existe no tabuleiro"); 
		}
		return pecas[linha][coluna]; 
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new ExcecaoTabuleiro("Posicao n�o existe no tabuleiro"); 
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca( Peca peca, Posicao posicao) {
		if (haUmaPeca(posicao)) {
			throw new ExcecaoTabuleiro("J� existe uma pe�a na posi��o" + posicao); 
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao; 		
	}
	
	private boolean posicaoExiste (int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas; 
	}
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna()); 
	}
	
	public boolean haUmaPeca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new ExcecaoTabuleiro("Posicao n�o existe no tabuleiro"); 
		}
		return peca(posicao) != null; 
	}

}
