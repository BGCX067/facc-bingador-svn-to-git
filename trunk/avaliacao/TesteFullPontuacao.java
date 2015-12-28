import java.util.Random;

public class TesteFullPontuacao {

	public static void main(String[] args) {

		RelatorioFinal relat = new RelatorioFinal();

		int nvoto;
		
		//teste 1
		System.out.println("\n\nTesta validacoes, notas validas, nao usa juiz e REPROVADO");
		System.out.println("*************************************************************");

		Pontuacao pont1 = new Pontuacao();

		System.out.println("(>) Valida votação: (espera FALSO) " + pont1.validaPontuacao());
		
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota juiz 5"); pont1.novoPontoJuiz(5);
		System.out.println("(>) Valida votação: (espera FALSO) " + pont1.validaPontuacao());

		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("Insere nota jurado valida 5"); pont1.novoPontoJurado(5);
		System.out.println("(>) Valida votação: (espera TRUE) " + pont1.validaPontuacao());
		
		System.out.println("(>) Usa nota juiz: (espera FALSO) " + pont1.usaPontoJuiz());
		
		relat.mostraFechamentoPontuacao(pont1);
		System.out.println("****************");
		


		//teste 2
		System.out.println("\n\nTesta 10 invalidas no limite, usa juiz e CLASSIFICADO ESPECIAL");
		System.out.println("*************************************************************");

		Pontuacao pont2 = new Pontuacao();

		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		System.out.println("Insere nota jurado valida 10"); pont2.novoPontoJurado(10);
		
		System.out.println("(>) Valida votação: (espera FALSO) " + pont2.validaPontuacao());

		System.out.println("Insere nota juiz 9"); pont2.novoPontoJuiz(9);
		System.out.println("(>) Valida votação: (espera TRUE) " + pont2.validaPontuacao());

		System.out.println("(>) Usa nota juiz: (espera TRUE) " + pont2.usaPontoJuiz());
		
		relat.mostraFechamentoPontuacao(pont2);
		System.out.println("****************");
		
		
	}
}
