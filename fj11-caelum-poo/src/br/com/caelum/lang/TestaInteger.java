/**
 * 
 */
package br.com.caelum.lang;

/**
 * @author Matos
 *
 */
public class TestaInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		
		String sValida = "20";
		String sInvalida = "2A";
		
		if(x.equals(y)) {
			System.out.println("São iguais.");
		} else {
			System.out.println("São diferentes.");
		}
		
		int a = Integer.parseInt(sValida);
		int b = Integer.parseInt(sInvalida);
		
		System.out.println("Valida: " + a 
				+ "\nInvalida: " + b);
		
	}

}
