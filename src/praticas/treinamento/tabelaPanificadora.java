package praticas.treinamento;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/* Você foi contratado para desenvolver o programa que monta a tabela de preços de pães.
 *
 * Montar uma tabela que mostre a quantidade de Pães (1 até 50 pães) a partir do preço do pão informado pelo usuário  
 */

public class tabelaPanificadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float precopao;
		float soma = 0;

		int quantidadepao = 0;

		System.out.println("\nPor gentileza, informar o Preço do Pão: ");
		precopao = leia.nextFloat();
		
		System.out.println("\nPanificadora Pão de Ontem -- Tabela de preços: ");
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
