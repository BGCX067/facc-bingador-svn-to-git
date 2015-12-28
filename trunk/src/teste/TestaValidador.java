package teste;

import java.util.ArrayList;

import suporte.Validador;

/**
 * Classe pessoal de teste para o Validador.class
 * 
 * @author André Marcos
 *
 */
public class TestaValidador {

	public static void main(String[] args) {

		Validador val = new Validador();
		ArrayList cartela = new ArrayList();
		int size, max;

		
		System.out.print("\nTeste 1 - Cartela de teste, correta: ");
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(4);
		cartela.add(5);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));
		
		
		System.out.print("\nTeste 2 - Cartela de teste, com um elemento a menos: ");
		cartela.clear();
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(4);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));
		

		System.out.print("\nTeste 3 - Cartela de teste, com um elemento a mais: ");
		cartela.clear();
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(4);
		cartela.add(5);
		cartela.add(9);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));
				
		
		System.out.print("\nTeste 4 - Cartela de teste, com um elemento fora do limite superior: ");
		cartela.clear();
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(4);
		cartela.add(99);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));

		
		System.out.print("\nTeste 5 - Cartela de teste, com um elemento fora do limite inferior: ");
		cartela.clear();
		cartela.add(-99);
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(4);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));

		
		System.out.print("\nTeste 6 - Cartela de teste, com elementos repetidos: ");
		cartela.clear();
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(9);
		cartela.add(9);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));
		
		
		System.out.print("\nTeste 7 - Cartela de teste, com elementos não ordenados: ");
		cartela.clear();
		cartela.add(1);
		cartela.add(2);
		cartela.add(3);
		cartela.add(9);
		cartela.add(4);
		System.out.println(cartela);
		System.out.print("checkCardIntegrity(5, 10, cartela) = ");
		System.out.println(val.checkCardIntegrity(5, 10, cartela));
		
		

	}
}
