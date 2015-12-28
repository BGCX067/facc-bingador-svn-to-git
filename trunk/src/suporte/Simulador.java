package suporte;

import java.util.ArrayList;
import java.util.Random;

public class Simulador {

	/**
	 * M�todo que gera uma cartela de jogo aleat�ria
	 * @param size quantidade de n�meros que formam a cartela
	 * @param max limite m�ximo dos n�meros v�lidos. sempre [1,max]
	 * @return a pr�rpia cartela, representada por uma lista de n�meros inteiros
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
				//Exception mex = new Exception("Valores necess�rios inv�lidos!");
				//mex.printStackTrace();
				//System.exit(0);
			  
			    //throw new Exception("Valores necess�rios inv�lidos!") ;
			
		}

		return card;

	}

}
