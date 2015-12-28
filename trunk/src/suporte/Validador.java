package suporte;

import java.util.ArrayList;

public class Validador {

	
	/**
	 * Método que checa a integridade da cartela conforme regras estipuladas
	 * @param s Tamanho da cartela. indica o a quantidade de números da cartela
	 * @param m Intervalo dos números válidos, sempre [1,m]
	 * @param c a própria cartela que esta sendo validada, ordenada
	 * @return true se a cartela é valida ou false, caso contrário
	 */
	public boolean checkCardIntegrity(int s, int m, ArrayList c){
		
		boolean verifica = true;
		
		// verificação tamanho da cartela
		// s é a quantidade de números
		if (c.size() != s)
			verifica = false;
		
		// verificação do intervalo de valores
		// valores validos devem estar entre [1,m]
		int lastNum = (int) c.get(c.size()-1);
		int firstNum = (int) c.get(0);
		
		if (firstNum < 1)
			verifica = false;

		if (lastNum > m)
			verifica = false;

		// verificação de repetições
		// não podem existir repetições na cartela
		for (int i=0; i < c.size()-1; i++) {
			if (c.get(i) == c.get(i+1))
				verifica = false;
		}
		
		
		return verifica;
		
	}
	
	
	
	
}
