package estruturasDeRepeticaoeArrays;

import java.util.Scanner;

	/*Faça um programa que peça uma nota, entre zero e dez.
	 *Mostre uma mensagem caso o valor seja inválido e continue pedindo a nota.
	 *O programa só para quando o valor inserido for o valor correto.
	 */

public class nota0a10While {

	public static void main(String[] args) {
	
		int nota;
		
		Scanner leia = new Scanner(System.in);
		 
		System.out.println("Por favor, digite uma nota entre 0 á 10:");	
		nota=leia.nextInt();
		
		while (true) {
			
			if (nota>=0 && nota<=10) break;//Aqui ele para o While e continua fora do laço
			
			System.out.println("\nValor inválido !"); 
			System.out.println("\nPor favor, digite uma nota entre 0 á 10: ");
			nota=leia.nextInt();
					
			}
		
		System.out.println("\nNota Salva com Sucesso!");
		
		}
		 
	}


