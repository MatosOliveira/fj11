/**
 * 
 */
package br.com.caelum.empresa.testes;

import br.com.caelum.empresa.rh.Empresa;
import br.com.caelum.empresa.rh.Funcionario;

/**
 * @author Matos
 *
 */
public class TesteEmpresa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Carlos Gomes Tibirica", "Tecnologia da Informação", 5000.0, "30/12/2012", "11.222.333-44");
		
		Empresa empresa = new Empresa("Eclipse IT", "11.222.333/0001-44");
		
		empresa.adicionaFuncionario(funcionario);
		
		//exibe os funcionarios
		empresa.mostra();
		
		
	}

}
