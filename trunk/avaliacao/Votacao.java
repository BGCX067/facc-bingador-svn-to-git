
public class Votacao { //N�O ALTERAR ESSA LINHA

	/**
	 * jurados[]: voto binario dos jurados: 1, 0 ou nulo (qualquer outro numero inteiro)
	 * juiz: voto do juiz (voto de minerva) 1 ou 0
	 */

	private int[] jurados = new int[10];  //N�O ALTERAR ESSA LINHA. PODE SER USADA.
	private int juiz;                     //N�O ALTERAR ESSA LINHA. PODE SER USADA.
	private boolean completa = false;     //N�O ALTERAR ESSA LINHA. PODE SER USADA.
	
	
	/**
	 * Guardo o novo voto de jurado
	 */
	void novoVotoJurado(int voto) { //N�O ALTERAR ESSA LINHA

		//implementar seu codigo aqui

	}

	/**
	 * Guardo voto de juiz
	 */
	void novoVotoJuiz(int voto) { //N�O ALTERAR ESSA LINHA

		//implementar seu codigo aqui
		
	}
	
	/**
	 * Retorna true se ser� preciso usar a nota do Juiz ou false caso contr�rio
	 * A nota do juiz ser� necess�ria caso de empate entre 0(os) e 1(s) no sistema
	 * de vota��o desconsiderando as notas nulas e ausencias.
	 */
	boolean usaVotoJuiz() { //N�O ALTERAR ESSA LINHA

		//implementar seu codigo aqui
		
		return true;
		
	}
	

	/**
	 * M�todo que retorna true ou false 
	 * Caso a votacao esteja completa (10 jurados e 1 juiz) ela � considerada valida 
	 * e ent�o completa. Neste caso o m�todo muda retorna um true. Caso contrario false.
	 */
	boolean validaVotacao() { //N�O ALTERAR ESSA LINHA
		
		//implementar seu codigo aqui
		
		
		return this.completa; //N�O ALTERAR ESSA LINHA

	}
	
	int getNotaJuiz() {
		return this.juiz;
	}
	
	
	
}
