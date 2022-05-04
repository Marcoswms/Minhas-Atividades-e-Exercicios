package praticas.treinamento;

import java.util.Scanner;

/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2);
 *Calcule a dist�ncia entre eles, mostrando 4 casas decimais ap�s a v�rgula.
 * 
 * Entrada:
 * 
 * A primeira linha cont�m dois valores de ponto flutuante: x1 y1;
 * A segunda linha cont�m dois valores de ponto flutuante x2 y2;
 * 
 * Saida:
 * 
 * Calcule e imprima o valor da dist�ncia, com 4 casas ap�s o ponto decimal.
 */

public class calculoDistancia {

	public static void main(String[] args) {
		
		float x1, y1;
        float x2, y2;
        double distancia;
        double distanciaDois;
        double resultado;
        double saida;
        
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextFloat(); y1 = scan.nextFloat();
        x2 = scan.nextFloat(); y2 = scan.nextFloat();
        
        distancia = (x2 - x1);
        distancia = distancia * distancia;
        distanciaDois = (y2 - y1);
        distanciaDois = distanciaDois * distanciaDois;
        resultado = distancia + distanciaDois;
        saida = Math.sqrt(resultado);
        
        System.out.println(String.format("%.4f", saida));
		
	}
}
