package aplicacao;

import xadres.PecaXadres;

public class UI {
	
	public static void printTabuleiro(PecaXadres[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				printPeca(pecas[i][j]);				
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPeca(PecaXadres peca) {
		if (peca == null) {
			System.out.print("-");			
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}

}
