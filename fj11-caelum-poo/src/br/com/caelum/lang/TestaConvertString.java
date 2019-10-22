/**
 * 
 */
package br.com.caelum.lang;

/**
 * Classe para converter uma String em Inteiro sem utilizar as bibliotecas que já fazem isto
 * 
 * @author Matos
 *
 */
public class TestaConvertString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String teste = "762";
		
		for(int i = 0; i < teste.length(); i++) {
			char a = teste.charAt(i);
			System.out.print(a); //imprime sem pular linha
		}

	}

}
