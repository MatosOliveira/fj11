/**
 * 
 */
package br.com.caelum.introducao;

/**
 * Classe que contém exercicios sobre Variaveis e Tipos Primitivos
 * 
 * @author Matos
 * @date 28-11-2018
 *
 */
public class BalancoTrimestral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		double mediaTrimestral = gastosTrimestre / 3;
		
		System.out.println("Gastos no Trimestre: " + gastosTrimestre);
		
		System.out.println("Media de gastos no Trimestre: " + mediaTrimestral);
		
		
		
	}

}
