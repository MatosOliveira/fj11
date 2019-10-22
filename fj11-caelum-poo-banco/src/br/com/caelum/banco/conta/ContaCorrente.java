/**
 * 
 */
package br.com.caelum.banco.conta;

/**
 * Classe para a Conta Corrente de um Cliente
 * 
 * @author Matos
 *
 */
public class ContaCorrente extends Conta {

	/**
	 * Calcula a taxa a ser debitada da conta
	 */
	public void atualizaTaxa(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	/**
	 * Metodo para deposito. Desconta R$ 0,10 a cada depósito
	 */
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

}
