package praticas.treinamento;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/* Voc� foi contratado para desenvolver o programa que monta a tabela de pre�os de p�es.
 *
 * Montar uma tabela que mostre a quantidade de P�es (1 at� 50 p�es) a partir do pre�o do p�o informado pelo usu�rio  
 */

public class tabelaPanificadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float precopao;
		float soma = 0;

		int quantidadepao = 0;

		System.out.println("\nPor gentileza, informar o Pre�o do P�o: ");
		precopao = leia.nextFloat();
		
		System.out.println("\nPanificadora P�o de Ontem -- Tabela de pre�os: ");
		System.out.println("");
		do {

			soma = soma + precopao;

			Locale ptBr = new Locale("pt", "BR");
			String valorString = NumberFormat.getCurrencyInstance(ptBr).format(soma);//get.Currencyinstance = Retorna um ponto flutuante em Moeda em conjunto com Locale (Especificar a localidade)

			quantidadepao++;

			System.out.println(quantidadepao + " - " + valorString);
		} while (quantidadepao < 50);

	}

}
