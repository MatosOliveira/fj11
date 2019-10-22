/**
 * 
 */
package br.caelum.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para testar o chat desenvolvido em aula (Server) 
 * 
 * @author Matos
 * 
 * @version 1.0 - Implementação inicial
 * @version 2.0 - Refatoração da classe
 *
 */
public class Servidor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//inicia o servidor
		new Servidor(12345).executa();
		
//		ServerSocket servidor = new ServerSocket(12345);
//		System.out.println("Porta 12345 aberta!");
//		
//		Socket cliente = servidor.accept();
//		System.out.println("Nova conexão com o cliente " + 
//					cliente.getInetAddress().getHostAddress());
//		
//		Scanner entrada = new Scanner(cliente.getInputStream());
//		while(entrada.hasNextLine()) {
//			System.out.println(entrada.nextLine());
//		}
//		
//		entrada.close();
//		servidor.close();
		
	}
	
	private int porta;
	private List<PrintStream> clientes;
	
	/**
	 * Construtor da classe
	 * 
	 * @param porta
	 * 		Porta de conexão
	 */
	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}

	@SuppressWarnings("resource")
	public void executa() throws IOException {
		ServerSocket servidor = new ServerSocket(this.porta);
		System.out.println("Porta 12345 aberta!");
		
		while(true) {
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + 
						cliente.getInetAddress().getHostAddress());
			
			//adiciona saida do cliente à lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);
			
			//cria tratador do cliente numa nova thread
			TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
			new Thread(tc).start();
		}
	}
	
	/**
	 * Distribui as mensagens para todos
	 * 
	 * @param msg
	 */
	public void distribuiMensagem(String msg) {
		// envia msg para todo mundo
		for (PrintStream cliente : this.clientes) {
			cliente.println(msg);
		}
	}
}
