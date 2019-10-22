/**
 * 
 */
package br.caelum.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Classe para testar o chat desenvolvido em aula (Client)
 * 
 * @author Matos
 * 
 * @version 1.0 - Implementação inicial
 * @version 2.0 - Refatoração da classe
 *
 */
public class Cliente {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException  {
		
		//dispara cliente
		new Cliente("127.0.0.1", 12345).executa();
		
		
//		Socket cliente = new Socket("127.0.0.1", 12345);
//		System.out.println("O cliente se conectou ao servidor!");
//		
//		Scanner teclado = new Scanner(System.in);
//		PrintStream saida = new PrintStream(cliente.getOutputStream());
//		
//		while(teclado.hasNextLine()) {
//			saida.println(teclado.nextLine());
//		}
//
//		saida.close();
//		teclado.close();
	} 
	
	private String host;
	private int porta;
	
	/**
	 * Construtor da classe
	 * 
	 * @param host
	 * 		Host do cliente
	 * @param porta
	 * 		Porta de conexão
	 */
	public Cliente(String host, int porta) {
		this.host = host;
		this.porta = porta;
	}
	
	/**
	 * Metodo para conexão com o servidor
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void executa() throws UnknownHostException, IOException {
		Socket cliente = new Socket(this.host, this.porta);
		System.out.println("O cliente se conectou ao servidor!");

		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while(teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}

		saida.close();
		teclado.close();
		cliente.close();
	}
	

}
