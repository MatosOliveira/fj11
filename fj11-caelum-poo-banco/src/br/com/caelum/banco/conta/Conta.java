/**
 * 
 */
package br.com.caelum.banco.conta;

/**
 * Classe que contem as informaçoes de uma conta
 * 
 * @author Matos
 *
 */
public abstract class Conta {

	protected double saldo;
	protected int numero;
	protected String nome;
	
	/**
	 * Obtem o nome do cliente
	 * 
	 * @return
	 * 		Nome do cliente
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Configura o nome do cliente
	 * 
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtem o numero da conta
	 * 
	 * @return
	 * 		Numero da conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Configura o numero da conta
	 * 
	 * @param numero
	 * 		Numero da conta
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Obtem o saldo da conta
	 * 
	 * @return
	 * 		Saldo da conta do cliente
	 */
	public double getSaldo() {
		return this.saldo;			
	}
	
	/**
	 * Metodo que realiza o saque da conta do cliente
	 * 
	 * @param valor
	 * 		Valor a ser retirado (sacado)
	 */
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Metodo que realiza o deposito na conta do cliente
	 * 
	 * @param valor
	 * 		Valor a ser depositado
	 */
	public void deposita(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou realizar um valor inválido.");
		} else {
			this.saldo += valor;
		}
		
	}
	
	/**
	 * Metodo abstrato para cobrança de taxa conforme o tipo de conta
	 * 
	 * @param taxa
	 * 		Aliquota (valor da taxa)
	 */
	public abstract void atualizaTaxa(double taxa);

	/*
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Conta))
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	
	
	
	
	
}
