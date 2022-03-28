package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

/*Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário.
 *A tabuada não deve necessariamente iniciar em 1 e terminar em 10.
 *O valor inicial e final devem ser informados também pelo usuário.
 * 
 * EX: Montar a tabuada de: 5
	Começar por: 4
	Terminar em: 7

	Vou montar a tabuada de 5 começando em 4 e terminando em 7:
	5 X 4 = 20
	5 X 5 = 25
	5 X 6 = 30
	5 X 7 = 35
 *Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
 */

public class tabuadaEscolhaNumerosFor {

	public static void main(String[] args) {

		int tabuada, comeca, termina;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\nGostaria de montar qual taboada? ");
			tabuada = leia.nextInt();

			System.out.println("\nComeça por: ");
			comeca = leia.nextInt();

			System.out.println("\nTermina em: ");
			termina = leia.nextInt();

			if (comeca > termina)
				System.out.println("\nVocê deve começar com um número menor !");

		} while (comeca > termina);

		System.out.println("\nMontando a Tabuada de " + tabuada + ", começando em " + comeca + " e terminando em "
				+ termina + ":");

		for (comeca = comeca; comeca <= termina; comeca++) {

			System.out.println(+tabuada + " X " + comeca + " = " + (tabuada * comeca));
		}
		System.out.println("\nFim !");
	}
}
