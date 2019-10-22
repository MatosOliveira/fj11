/**
 * 
 */
package br.com.caelum.collections;

import java.util.Collection;
import java.util.HashSet;

/**
 * Esta classe mede a performance entre dois tipos de Collections: List e Set utilizando uma de
 * suas implementações.
 * 
 * @author Matos
 *
 */
public class TestaPerformance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Iniciando ... ");
		
		//Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		
		
		int total = 30000;
		
		//Insere elementos
		for(int i = 0; i < total; i++) {
			
			long inicioInsercao = System.currentTimeMillis();
			
			teste.add(i);
			
			//Medir o tempo de inserção
			if (i == total - 1) {
				
				long fimInsercao = System.currentTimeMillis();
				long tempoInsercao = fimInsercao - inicioInsercao;
				
				System.out.println("Tempo de Inserção: " + tempoInsercao);
			}
			
		}
		
		//Busca de elementos
		for(int i = 0; i < total; i++) {
			
			long inicioBusca = System.currentTimeMillis();
			
			teste.contains(i);
			
			//Medir o tempo de busca
			if (i == total - 1) {
				
				long fimBusca = System.currentTimeMillis();
				long tempoBusca = fimBusca - inicioBusca;
				
				System.out.println("Tempo de Busca: " + tempoBusca);
			}
			
		}
		
		//Mede o tempo total
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tempo Total Gasto: " + tempo);

	}

}
