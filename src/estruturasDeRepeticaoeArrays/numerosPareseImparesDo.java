package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

	/*Faça um programa que peça para o cliente digitar a quantidade de números que deseja inserir.
	 * Mostrar a quantidade de Números Pares dentre os Digitados.
	 * Mostrar a quantidade de Números Ímpares Digitados.
	 */



public class numerosPareseImparesDo {

	public static void main(String[] args) {
		
		int quantidade;//3
		int numeroCliente;
		int contador=0;//3
		int pares=0, impares=0;	
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantidade de Números a inserir: ");
		quantidade=leia.nextInt();
		
		do {
			System.out.println("\nDigite seu Número: ");
			numeroCliente=leia.nextInt();
				
			if (numeroCliente % 2 == 0) pares++;//Descobrir se Par ou impar é dividir por 2 e se o RESTO for 0 ele será PAR.
			else impares++;
			
			contador++;
			
		} while (contador < quantidade);
		
		System.out.println("\nA quantidade de Pares é: " + pares);
		System.out.println("\nA quantidade de Ímpares é: " + impares);
		
	}
}
