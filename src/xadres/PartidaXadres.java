package xadres;

import tabuleiroDoJogo.Posicao;
import tabuleiroDoJogo.Tabuleiro;
import xadres.pecas.Rei;
import xadres.pecas.Tore;

public class PartidaXadres {
	// nesta classe teremos as regras é o coração do programa
	
	private Tabuleiro tabuleiro; 
	
	public PartidaXadres() {
		tabuleiro = new Tabuleiro(8, 8); 
		setupInicial();
	}
	
	public PecaXadres[][] getPecas(){
		PecaXadres[][] mat = new PecaXadres[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadres) tabuleiro.peca(i, j); 
			}
		}
		return mat; 
	}
	
	private void setupInicial() {
		tabuleiro.colocarPeca(new Tore(tabuleiro, Cor.BRANCAS), new Posicao(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETAS), new Posicao(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCAS), new Posicao(7, 4));
	}
}
