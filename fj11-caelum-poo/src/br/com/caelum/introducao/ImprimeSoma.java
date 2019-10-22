
package br.com.caelum.introducao;

/**
 * Classe que contém exercícios sobre loops, escopo de variaveis e blocos
 * 
 * @author Matos
 * @date 28-11-2018
 *
 */
public class ImprimeSoma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int resultado = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			resultado += i;
			
		}
		
		System.out.println(resultado);

	}

}
