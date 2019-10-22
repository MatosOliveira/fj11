/**
 * 
 */
package br.com.caelum.banco.testes;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

/**
 * Classe para teste com a interface Map
 * @author Matos
 *
 */
public class TestaMapa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		c1.deposita(100000.0);
		c2.deposita(45000.0);
		
		//Cria o Mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		//adiciona valor e chave
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		//Conta do diretor
		Conta contaDiretor = mapaDeContas.get("diretor");
		
		System.out.println("Saldo da Conta : " + contaDiretor.getSaldo());
		
		
		
		

	}

}
