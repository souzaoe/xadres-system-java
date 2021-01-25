package xadres.pecas;

import tabuleiroDoJogo.Tabuleiro;
import xadres.Cor;
import xadres.PecaXadres;

public class Tore extends PecaXadres {

	public Tore(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);		
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
