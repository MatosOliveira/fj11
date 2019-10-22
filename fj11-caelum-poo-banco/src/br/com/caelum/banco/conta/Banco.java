/**
 * 
 */
package br.com.caelum.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe que contem informações de um banco
 * 
 * @author Matos
 *
 */
public class Banco {

	protected List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> mapaConta = new HashMap<>(); 
	
	/**
	 * Metodo para adicionar uma conta na lista e no mapa
	 * 
	 * @param c
	 */
	public void adiciona(Conta c) {
		this.contas.add(c);
		mapaConta.put(c.getNome(), c);
	}
	
	/**
	 * Metodo que retorna a conta
	 * 
	 * @param x
	 * 		Indice da conta
	 * @return
	 * 		Conta na posicao x
	 */
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	
	/**
	 * Metodo para obter a quantidade de contas
	 * 
	 * @return
	 * 		Quantidade de contas
	 */
	public int pegaQuantidadeContas() {
		return this.contas.size();
	}

	/**
	 * Metodo para buscar o nome
	 * 
	 * @param nome
	 * 		Nome procurado
	 * @return
	 * 		Nome mapeado
	 */
	public Conta buscaPorNome(String nome) {
		return this.mapaConta.get(nome);
	}
	
	
}
