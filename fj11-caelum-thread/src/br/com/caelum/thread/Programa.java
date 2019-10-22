/**
 * 
 */
package br.com.caelum.thread;

/**
 * @author Matos
 *
 */
public class Programa implements Runnable {

	private int id;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Implementação do metodo para execução da Thread
	 */
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " - valor: " + id);
		}
	}
}
