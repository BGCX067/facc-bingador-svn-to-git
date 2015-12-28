package suporte;

import java.util.ArrayList;

public class Validador {

	
	/**
	 * M�todo que checa a integridade da cartela conforme regras estipuladas
	 * @param s Tamanho da cartela. indica o a quantidade de n�meros da cartela
	 * @param m Intervalo dos n�meros v�lidos, sempre [1,m]
	 * @param c a pr�pria cartela que esta sendo validada, ordenada
	 * @return true se a cartela � valida ou false, caso contr�rio
	 */
	public boolean checkCardIntegrity(int s, int m, ArrayList c){
		
		boolean verifica = true;
		
		// verifica��o tamanho da cartela
		// s � a quantidade de n�meros
		if (c.size() != s)
			verifica = false;
		
		// verifica��o do intervalo de valores
		// valores validos devem estar entre [1,m]
		int lastNum = (int) c.get(c.size()-1);
		int firstNum = (int) c.get(0);
		
		if (firstNum < 1)
			verifica = false;

		if (lastNum > m)
			verifica = false;

		// verifica��o de repeti��es
		// n�o podem existir repeti��es na cartela
		for (int i=0; i < c.size()-1; i++) {
			if (c.get(i) == c.get(i+1))
				verifica = false;
		}
		
		
		return verifica;
		
	}
	
	
	
	
}
