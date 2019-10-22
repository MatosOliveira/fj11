/**
 * 
 */
package br.com.caelum.banco.sistema;

import br.com.caelum.banco.conta.Conta;

/**
 * @author Matos
 *
 */
public class AtualizadorContas {

	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta conta) {
		// imprime o saldo anterior
		// lembrando de somar o saldo final ao atributo saldoTotal
		System.out.println("Saldo Anterior: " + conta.getSaldo());
		
		//atualiza a conta
		conta.atualizaTaxa(selic);
		
		//imprime o saldo final
		System.out.println("Saldo Final: " + conta.getSaldo());
		
		this.saldoTotal += conta.getSaldo();
		
		System.out.println("Saldo Total: " + this.getSaldoTotal());
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
