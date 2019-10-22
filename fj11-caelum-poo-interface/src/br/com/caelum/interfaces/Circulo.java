/**
 * 
 */
package br.com.caelum.interfaces;

/**
 * @author Matos
 *
 */
public class Circulo implements AreaCalculavel {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	
}
