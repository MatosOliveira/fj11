/**
 * 
 */
package br.com.caelum.io;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class EntradaDeUmArquivo {

	/**
	 * Classe para leitura de um arquivo (utilizando a classe Scanner) ou da entrada do teclado
	 * 
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Leitura da entrada do teclado
		InputStream is = System.in;
		
		//Leitura de um arquivo
		//InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
	
		System.out.println("Digite a sua mensagem: ");
		
		while(entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();

	}

}
