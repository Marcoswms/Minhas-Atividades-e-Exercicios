package praticas.treinamento;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/* Faça um programa que leia o código dos itens pedidos em um cardápio e as quantidades desejadas.
 * Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido.
 * Considere que o cliente deve informar quando o pedido deve ser encerrado.
 * 
 *	Especificação   Código  Preço
	Cachorro Quente 100     R$ 1,20
	Bauru Simples   101     R$ 1,30
	Bauru com ovo   102     R$ 1,50
	Hambúrguer      103     R$ 1,20
	Cheeseburguer   104     R$ 1,30
	Refrigerante    105     R$ 1,00
 */

public class cardapioLanchonete {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

		int codigoProduto = 0, quantidade = 0, finalizar = 0;
		Double totalA = 0.0, totalB = 0.0, totalC = 0.0, totalD = 0.0, totalE = 0.0, totalF = 0.0, totalPedido = 0.0;
		Scanner scan = new Scanner(System.in);

		System.out.println("\nBem vinde a Lanchonete: Nosso Sabor ! ");

		System.out.println("\nEspecificação  " + " Código " + " Preço");

		System.out.println("Cachorro Quente " + " 100 " + " R$ 1,20");
		System.out.println("Bauru Simples " + "   101 " + " R$ 1,30");
		System.out.println("Bauru com ovo " + "   102 " + " R$ 1,50");
		System.out.println("Hambúrguer " + "      103 " + " R$ 1,20");
		System.out.println("Cheeseburguer " + "   104 " + " R$ 1,30");
		System.out.println("Refrigerante " + "    105 " + " R$ 1,00");

		do {
			System.out.println("\nInsira o Código do ítem desejado: ");
			codigoProduto = scan.nextInt();

			if (codigoProduto >= 100 && codigoProduto <= 105) {

				System.out.println("\nInsira a Quantidade do ítem escolhido: ");
				quantidade = scan.nextInt();

				if (codigoProduto == 100) {
					totalA = quantidade * (1.20);
					a = quantidade;

				} else if (codigoProduto == 101) {
					totalB = quantidade * (1.30);
					b = quantidade;
				} else if (codigoProduto == 102) {
					totalC = quantidade * (1.50);
					c = quantidade;
				} else if (codigoProduto == 103) {
					totalD = quantidade * (1.20);
					d = quantidade;
				} else if (codigoProduto == 104) {
					totalE = quantidade * (1.30);
					e = quantidade;
				} else if (codigoProduto == 105) {
					totalF = quantidade * (1.00);
					f = quantidade;
				}

				System.out.println("\nTecle 0 para Encerrar seu pedido ou Tecle 1 para continuar seu Pedido: ");
				finalizar = scan.nextInt();

				while (finalizar != 0 && finalizar != 1) {
					System.out.println(
							"\nOpção Inválida ! Tecle 0 para Encerrar seu pedido ou Tecle 1 para continuar seu Pedido: ");
					finalizar = scan.nextInt();
				}

			} else {

				System.out.println("\nCódigo Errado !!");
				finalizar++;
			}
		} while (finalizar > 0); // Só termina quando retornar False

		totalPedido = totalA + totalB + totalC + totalD + totalE + totalF;

		Locale ptBr = new Locale("pt", "BR");
		String conversaoA = NumberFormat.getCurrencyInstance(ptBr).format(totalA);
		String conversaoB = NumberFormat.getCurrencyInstance(ptBr).format(totalB);
		String conversaoC = NumberFormat.getCurrencyInstance(ptBr).format(totalC);
		String conversaoD = NumberFormat.getCurrencyInstance(ptBr).format(totalD);
		String conversaoE = NumberFormat.getCurrencyInstance(ptBr).format(totalE);
		String conversaoF = NumberFormat.getCurrencyInstance(ptBr).format(totalF);
		String conversaoTotalP = NumberFormat.getCurrencyInstance(ptBr).format(totalPedido);

		System.out.println("\nCódigo " + " Quantidade " + " Valor p/Quantidade");

		System.out.println(" 100       " + a + "        " + conversaoA);
		System.out.println(" 101       " + b + "        " + conversaoB);
		System.out.println(" 102       " + c + "        " + conversaoC);
		System.out.println(" 103       " + d + "        " + conversaoD);
		System.out.println(" 104       " + e + "        " + conversaoE);
		System.out.println(" 105       " + f + "        " + conversaoF);

		System.out.println("\nTotal do Pedido: " + conversaoTotalP);

	}
}
