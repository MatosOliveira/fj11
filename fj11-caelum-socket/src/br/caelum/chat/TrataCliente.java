/**
 * 
 */
package br.caelum.chat;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class TrataCliente implements Runnable {

	private InputStream cliente;
	private Servidor servidor;
	
	/**
	 * Construtor da classe
	 * 
	 * @param cliente
	 * 		Cliente
	 * @param servidor
	 * 		Servidor
	 */
	public TrataCliente(InputStream cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}
	
	/**
	 * 
	 */
	public void run() {
		//quando chegar uma mensagem distribui para todos
		Scanner s = new Scanner(this.cliente);
		while(s.hasNextLine()) {
			servidor.distribuiMensagem(s.nextLine());
		}
		
		s.close();
	}
}
