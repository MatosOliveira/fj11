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
public class ImprimeFatorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for(int n = 1; n <= 20; n++) {
			fatorial *= n;
			System.out.println(fatorial);
		}

	}

}
