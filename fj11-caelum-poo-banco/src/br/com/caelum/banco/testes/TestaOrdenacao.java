/**
 * 
 */
package br.com.caelum.banco.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaPoupanca;

/**
 * @author Matos
 *
 */
public class TestaOrdenacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new ArrayList<>();
		
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaPoupanca cp4 = new ContaPoupanca();
		ContaPoupanca cp5 = new ContaPoupanca();
		
		cp1.setNumero(1234);
		cp2.setNumero(5678);
		cp3.setNumero(9012);
		cp4.setNumero(3456);
		cp5.setNumero(7890);
		
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cp3);
		contas.add(cp4);
		contas.add(cp5);
		
		//Ordena as contas pelo numero
		Collections.sort(contas);
		
		//Inverte a ordem
		//Collections.reverse(contas);
		
		//Imprime os resultados
		for(Conta conta : contas) {
			System.out.println("Numero da Conta: " + conta.getNumero());
		}
		

	}

}
