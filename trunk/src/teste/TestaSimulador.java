package teste;

import java.util.ArrayList;
import java.util.Scanner;

import suporte.Simulador;

/**
 * Classe pessoal de teste para o Simulador.class
 * 
 * @author André Marcos
 *
 */
public class TestaSimulador {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Simulador sim = new Simulador();
		ArrayList cartela;
		int size, max;

		do {
			System.out.println("Entre com os valores para SIZE e MAX: ");
			size = teclado.nextInt();
			max = teclado.nextInt();
			
			cartela = sim.buildCardGame(size, max);
			
			
			System.out.println(cartela);

		} while (true);

	}
}
