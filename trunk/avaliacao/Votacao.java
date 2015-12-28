
public class Votacao { //NÃO ALTERAR ESSA LINHA

	/**
	 * jurados[]: voto binario dos jurados: 1, 0 ou nulo (qualquer outro numero inteiro)
	 * juiz: voto do juiz (voto de minerva) 1 ou 0
	 */

	private int[] jurados = new int[10];  //NÃO ALTERAR ESSA LINHA. PODE SER USADA.
	private int juiz;                     //NÃO ALTERAR ESSA LINHA. PODE SER USADA.
	private boolean completa = false;     //NÃO ALTERAR ESSA LINHA. PODE SER USADA.
	
	
	/**
	 * Guardo o novo voto de jurado
	 */
	void novoVotoJurado(int voto) { //NÃO ALTERAR ESSA LINHA

		//implementar seu codigo aqui

	}

	/**
	 * Guardo voto de juiz
	 */
	void novoVotoJuiz(int voto) { //NÃO ALTERAR ESSA LINHA

		//implementar seu codigo aqui
		
	}
	
	/**
	 * Retorna true se será preciso usar a nota do Juiz ou false caso contrário
	 * A nota do juiz será necessária caso de empate entre 0(os) e 1(s) no sistema
	 * de votação desconsiderando as notas nulas e ausencias.
	 */
	boolean usaVotoJuiz() { //NÃO ALTERAR ESSA LINHA

		//implementar seu codigo aqui
		
		return true;
		
	}
	

	/**
	 * Método que retorna true ou false 
	 * Caso a votacao esteja completa (10 jurados e 1 juiz) ela é considerada valida 
	 * e então completa. Neste caso o método muda retorna um true. Caso contrario false.
	 */
	boolean validaVotacao() { //NÃO ALTERAR ESSA LINHA
		
		//implementar seu codigo aqui
		
		
		return this.completa; //NÃO ALTERAR ESSA LINHA

	}
	
	int getNotaJuiz() {
		return this.juiz;
	}
	
	
	
}
