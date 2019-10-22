/**
 * 
 */
package br.com.caelum.banco.testes;

import br.com.caelum.banco.conta.Banco;
import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

/**
 * Classe para testar as implementações da classe Banco
 * 
 * @author Matos
 *
 */
public class TestaBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Conta conta1 = new ContaCorrente();
		conta1.setNumero(1234);
		conta1.setNome("Lopes");
		
		Conta conta2 = new ContaCorrente();
		conta2.setNumero(5678);
		conta2.setNome("Felipe");
		
		Conta contaPoup1 = new ContaPoupanca();
		contaPoup1.setNumero(9012);
		contaPoup1.setNome("Talles");
		
		Conta contaPoup2 = new ContaPoupanca();
		contaPoup2.setNumero(3456);
		contaPoup2.setNome("Benjamin");
		
		//Adiciona Conta
		banco.adiciona(conta1);
		banco.adiciona(conta2);
		banco.adiciona(contaPoup1);
		banco.adiciona(contaPoup2);
		
		//Imprime as contas
		for(int i = 0; i < banco.pegaQuantidadeContas(); i++) {
			System.out.println("Informações da conta --> " 
									+ "Nome: " + banco.pega(i).getNome()
									+ "\tNumero: " + banco.pega(i).getNumero());
		}
		

	}

}
