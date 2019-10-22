/**
 * 
 */
package br.com.caelum.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Classe para leitura da entrada padrão do teclado ou de um arquivo, podendo jogar a informação
 * na tela (View Console) ou gravar em outro arquivo.
 * 
 * 
 * @author Matos
 *
 */
public class TestaEntrada {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Lendo da Entrada do Teclado
		//InputStream is = System.in;
		
		/*
		//Lendo de um arquivo
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		*/
		
		//Forma mais suscinta para leitura de arquivo, mas menos legivel
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("arquivo.txt")));
		
		//Gravação de um arquivo
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("saida.txt")));
		
		//System.out.println("Digite a mensagem: ");
		
		try {
			String linha = br.readLine(); //primeira linha
			
			while(linha != null) {
				//System.out.println(linha);
				
				//grava no arquivo
				bw.write(linha);
				bw.newLine();
				
				linha = br.readLine();
			}
			
			bw.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
