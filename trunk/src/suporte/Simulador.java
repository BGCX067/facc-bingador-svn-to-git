package suporte;

import java.util.ArrayList;
import java.util.Random;

public class Simulador {

	/**
	 * Método que gera uma cartela de jogo aleatória
	 * @param size quantidade de números que formam a cartela
	 * @param max limite máximo dos números válidos. sempre [1,max]
	 * @return a prórpia cartela, representada por uma lista de números inteiros
	 */
	public ArrayList buildCardGame(int size, int max) {

		ArrayList card = new ArrayList();
		Random ran = new Random();
		int novoNum;

		if (size <= max) {

			while (card.size() < size) {

				novoNum = ran.nextInt(max) + 1;

				if (!card.contains(novoNum))
					card.add(novoNum);

			}

		} else {
				//Exception mex = new Exception("Valores necessários inválidos!");
				//mex.printStackTrace();
				//System.exit(0);
			  
			    //throw new Exception("Valores necessários inválidos!") ;
			
		}

		return card;

	}

}
