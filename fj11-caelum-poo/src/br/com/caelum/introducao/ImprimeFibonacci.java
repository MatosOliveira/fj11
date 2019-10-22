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
public class ImprimeFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ImprimeFibonacci fib = new ImprimeFibonacci();
		
		for (int i = 0; i <= 10; i++ ) {
			System.out.println("Fibonacci " + i + " = " + fib.calculaFibonacci(i));
		}

	}
	
	/**
	 * Calcula a sequencia de Fibonacci
	 *  
	 * @param n
	 * 		Quantidade de elementos
	 * @return
	 * 		Sequencia conforme o valor de n
	 */
	public long calculaFibonacci(long n) {
		if(n == 0) {
			return 0;
		}else if(n == 1){
			return 1;
		}else {
			return calculaFibonacci(n -1) + calculaFibonacci(n - 2);
		} 
	}

}
