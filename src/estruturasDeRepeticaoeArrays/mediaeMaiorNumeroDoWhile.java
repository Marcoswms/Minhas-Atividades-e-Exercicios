package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

	/*Faça um programa que leia 5 números.
	 *Informar o Maior número.
	 *Informar a Média destes números.
	 */

public class mediaeMaiorNumeroDoWhile {

	public static void main(String[] args) {
		
		int numero; 
		int contador=0;
		int maior=0;
		int soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um Número: ");
			numero=leia.nextInt();
		
			soma = soma + numero;
		
			if (numero > maior) maior = numero;
		
			contador++;
		
		} while(contador < 5);
		
		System.out.println("\nMaior Número: " + maior);
		System.out.println("\nA Média é: " + (soma/5));
				
	}

}
