/**
 * 
 */
package br.com.caelum.empresa.testes;

import br.com.caelum.empresa.rh.Funcionario;

/**
 * Classe para testar o funcionario
 * 
 * @author Matos
 *
 */
public class TesteFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(
				"Carlos Gomes Tibirica"
				, "Tecnologia da Informação"
				, 5000.0
				, "30/12/2012"
				, "11.222.333-44");
		
		Funcionario funcionario1 = new Funcionario(
				"Jose Ramos"
				, "Tecnologia da Informação"
				, 15000.0
				, "30/01/2012"
				, "55.666.777-88");
		
		//funcionario.setNome("Carlos Gomes Tibirica");
		//funcionario.setDepartamento("Tecnologia da Informação");
		//funcionario.setRg("11.222.333-44");
		//funcionario.setDataEntrada("30/12/2012");
		//funcionario.setSalario(5000.0);
		
		//Exibe as informações do funcionario
		funcionario.mostra();
		funcionario1.mostra();
		
		// Aplica o aumento
		funcionario.setSalario(funcionario.recebeAumento(0.1));
		funcionario.setSalario(funcionario1.recebeAumento(0.1));
		
	}

}
