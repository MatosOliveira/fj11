/**
 * 
 */
package br.com.caelum.empresa.rh;

/**
 * Classe que contem informaçoes da empresa
 * 
 * @author Matos
 *
 */
public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario [] funcionario;
	private int numMaxFuncionarios = 10;
	
	/* Construtor padrão
	public Empresa(){
		
	}*/
	
	/**
	 * Construtor com parâmetros
	 * 
	 * @param nome
	 * 		Nome da Empresa
	 * @param cnpj
	 * 		CNPJ da Empresa
	 */
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	/**
	 * Obtem o nome da Empresa
	 * 
	 * @return
	 * 		Nome da Empresa
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Configura o nome da Empresa
	 * 
	 * @param nome
	 * 		Nome da Empresa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtem o cnpj da empresa
	 * 
	 * @return
	 * 		CNPJ da Empresa
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Configura o cnpj da empresa
	 * 
	 * @param cnpj
	 * 		CNPJ da empresa
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	/**
	 * Metodo para adicionar um Funcionario
	 * 
	 * Verifica se existe uma posição vazia e insere o novo funcionario.
	 * 
	 * @param f
	 * 		Funcionario a ser inserido
	 */
	public void adicionaFuncionario(Funcionario f) {
		
		this.funcionario = new Funcionario[numMaxFuncionarios];
		int cont = 0;
		
		if(this.funcionario.length <= cont) {
			System.out.println("Array vazio!");
		} else if (this.funcionario.length > numMaxFuncionarios){
			System.out.println("Array cheio!");
		} else {
			System.out.println("Adicionando o funcionario: " + f.getNome());
			this.funcionario[cont] = f;
			cont++;
		}
		
	}
	
	/**
	 * Obtem o funcionario na posicao especifica
	 * 
	 * @param posicao
	 * 		Posicao informada
	 * @return
	 * 		Funcionario
	 */
	public Funcionario getFuncionario(int posicao) {
		return this.funcionario[posicao];
	}
	
	/**
	 * Metodo para exibir os funcionarios cadastrados
	 */
	public void mostra(){
		for (int i = 0; i < funcionario.length; i++){
			if(funcionario[i] != null){
				this.getFuncionario(i).mostra();
			}
			
		}
	}
	
}
