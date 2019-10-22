/**
 * 
 */
package br.caelum.chat;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Thread para receber as mensagens enviadas pelo servidor
 *  
 * @author Matos
 *
 */
public class Recebedor implements Runnable {
	
	private InputStream servidor;
	
	public Recebedor(InputStream servidor) {
		this.servidor = servidor;
	}
	
	public void run() {
		//recebe a mensagem do servidor e imprime na tela
		Scanner s = new Scanner(this.servidor);
		
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		s.close();
	}
	
}
