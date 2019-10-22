/**
 * 
 */
package br.com.caelum.lang;

/**
 * @author Matos
 *
 */
public class TestaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "fj11";
		String s2 = s.replaceAll("1", "2");
		System.out.println("String original: " + s 
				+ "\nNova String: " + s2);

	}

}
