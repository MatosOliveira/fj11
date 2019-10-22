/**
 * 
 */
package br.com.caelum.introducao;

/**
 * Classe que contém exercícios sobre loops, escopo de variaveis e blocos
 * 
 * @author Matos
 * @date 28-11-2018
 *
 */
public class ImprimeMultiplosTres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
