/**
 * 
 */
package br.com.caelum.banco.testes;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

/**
 * Classe para testar a implementação da interface SET
 * 
 * @author Matos
 *
 */
public class TestaContaSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Conta> contas = new HashSet<>();
		
		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
		Conta conta3 = new ContaCorrente();
		Conta conta4 = new ContaCorrente();
		Conta conta5 = new ContaCorrente();
		
		conta1.setNumero(1234);
		conta2.setNumero(5678);
		conta3.setNumero(9012);
		conta4.setNumero(1234);
		conta5.setNumero(5678);
		
		//Adicionando contas (mesmo repetidas)
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		contas.add(conta5);
		
		//Imprime somente as contas não repetidas
		for(Conta c : contas) {
			System.out.println(c.getNumero());
		}
		
		

	}

}
