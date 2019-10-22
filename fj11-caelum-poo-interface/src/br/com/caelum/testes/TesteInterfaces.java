/**
 * 
 */
package br.com.caelum.testes;

import br.com.caelum.interfaces.AreaCalculavel;
import br.com.caelum.interfaces.Circulo;
import br.com.caelum.interfaces.Quadrado;
import br.com.caelum.interfaces.Retangulo;

/**
 * @author Matos
 *
 */
public class TesteInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AreaCalculavel aCalc = new Quadrado(2);
		AreaCalculavel aCalc2 = new Retangulo(2, 3);
		AreaCalculavel aCalc3 = new Circulo(4);
		
		System.out.println(aCalc.calculaArea());
		System.out.println(aCalc2.calculaArea());
		System.out.printf("%.2f", aCalc3.calculaArea());

	}

}
