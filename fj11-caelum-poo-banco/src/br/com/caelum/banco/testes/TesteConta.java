/**
 * 
 */
package br.com.caelum.banco.testes;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.sistema.AtualizadorContas;

/**
 * @author Matos
 *
 */
public class TesteConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		ContaCorrente cCorrente = new ContaCorrente();
		ContaPoupanca cPoupanca = new ContaPoupanca();
		
		AtualizadorContas atualConta = new AtualizadorContas(0.065);
		
		conta.deposita(1500.0);
		cCorrente.deposita(3500.0);
		cPoupanca.deposita(4500.0);
		
		/*
		conta.atualizaTaxa(0.1);
		cCorrente.atualizaTaxa(0.05);
		cPoupanca.atualizaTaxa(0.01);
		
		System.out.println(conta.getSaldo());
		System.out.println(cCorrente.getSaldo());
		System.out.println(cPoupanca.getSaldo());
		*/
		
		atualConta.roda(conta);
		atualConta.roda(cCorrente);
		atualConta.roda(cPoupanca);
		
		System.out.println("Atualizador da conta: " + atualConta.getSaldoTotal());


	}

}
