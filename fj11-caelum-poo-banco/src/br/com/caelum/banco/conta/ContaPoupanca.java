/**
 * 
 */
package br.com.caelum.banco.conta;

/**
 * @author Matos
 *
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	/**
	 * Calcula a taxa a ser debitada da conta
	 */
	public void atualizaTaxa(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	/**
	 * Compara os numeros das contas para ser usado nos metodos de ordenação
	 */
	public int compareTo(ContaPoupanca cp) {
		
		if (this.getNumero() < cp.getNumero()) {
			return -1;
		} 
		
		if (this.getNumero() > cp.getNumero()) {
			return 1;
		}
		
		return 0;
	}
	
	
}
