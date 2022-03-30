package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

//O operador ternário é um recurso para tomada de decisões com objetivo similar ao do if/else, mas que é codificado em apenas uma linha.

public class operadorTernario {

	public static void main(String[] args) {

		int numeroDias; // valor entre 1 e 30

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInforme uma data entre o dia 01 ao 30: ");
		numeroDias = leia.nextInt();

		System.out.println((numeroDias < 15) ? "Primeira quinzena" : "Segunda quinzena"); //Ao avaliar a expressão booleana, caso ela seja verdadeira, o código 1, declarado após o ponto de interrogação (?) será executado; do contrário, o programa irá executar o código 2, declarado após os dois pontos (:).

	}

}
