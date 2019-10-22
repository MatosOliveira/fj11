/**
 * 
 */
package br.com.caelum.introducao;

/**
 * Classe que contém exercícios sobre loops, escopo de variaveis e blocos
 * 
 * @author Matos
 * @date 29-11-2018
 *
 */
public class ImprimeValorX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 13;
		
		while (x > 1) {
			
			if(x % 2 == 0) {
				x /= 2;
			} else {
				x = 3 * x + 1;
			}
			
			System.out.print(x);
			
			if(x > 1) {
				System.out.print(" -> ");
			}
			
		}
		
	}

}
