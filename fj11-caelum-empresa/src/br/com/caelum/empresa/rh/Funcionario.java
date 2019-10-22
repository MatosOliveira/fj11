/**
 * 
 */
package br.com.caelum.empresa.rh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que contem as informações do funcionario
 * 
 * @author Matos
 * @date 12/12/2018
 *
 */
public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	//private int id = 0;
	public static final int QTDE_MESES = 12;
	private boolean estaNaEmpresa = true;
	
	/**
	 * Construtor padrão
	 */
	/*public Funcionario() {
		
	}*/
	
	/**
	 * Construtor com parametros
	 * 
	 * @param nome
	 * 		Nome do Funcionario
	 * @param departamento
	 * 		Departamento do Funcionario
	 * @param salario
	 * 		Salario do Funcionario
	 * @param dataEntrada
	 * 		Data de Entrada do Funcionario
	 * @param rg
	 * 		RG do Funcionario
	 */
	public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
	}
	
	/**
	 * Obtem o nome do funcionario
	 * 
	 * @return
	 * 		Nome do Funcionario
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Configura o nome do funcionario
	 * 
	 * @param nome
	 * 		Nome do Funcionario
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtem o nome do departamento
	 * 
	 * @return
	 * 		Departamento do Funcioario
	 */
	public String getDepartamento() {
		return departamento;
	}
	
	/**
	 * Configura o nome do departamento
	 * 
	 * @param departamento
	 * 		Nome do departamento
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	/**
	 * Obtem o salario
	 * 
	 * @return
	 * 		Salario do funcionario
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * Configura o salario do funcionario
	 * 
	 * @param salario
	 * 		Salario do funcionario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Obtem a Data de Entrada na empresa
	 * 
	 * @return
	 * 		Data de Entrada
	 */
	public String getDataEntrada() {
		return dataEntrada;
	}
	
	/**
	 * Configura a data de entrada
	 * 
	 * @param dataEntrada
	 * 		Data de Entrada
	 */
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
		
		//Formatação da Data
		String mascara = "dd/MM/yyyy";
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		@SuppressWarnings("unused")
		Date data = null;
		
		try {
				data = formatador.parse(dataEntrada);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/**
	 * Obtem o RG do funcionario
	 * 
	 * @return
	 * 		RG do funcionario
	 */
	public String getRg() {
		return rg;
	}
	
	/**
	 * Configura o rg do funcionario
	 * 
	 * @param rg
	 * 		RG do funcionario
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
 	
	/* TENTAR FAZER
	public int getId() {
		return this.id;
	}
	*/
	
	/**
	 * Metodo para calcular o aumento de salario
	 * 
	 * @param percentual
	 * 		Percentual  do aumento
	 * @return
	 * 		Novo salario
	 */
	public double recebeAumento(double percentual) {
		salario += (salario * percentual);
		
		System.out.println("==============================================" 
				+ "\nINFORMACOES APOS O AUMENTO " 
				+ "\nNovo Salario " + this.getSalario()
				+ "\nGanho Anual Atualizado " + this.calculaGanhoAnual());
		
		return this.salario;	
	}
	
	/**
	 * Calcula o ganho anual (em 12 meses)
	 * 
	 * @return
	 * 		Salario anual
	 */
	public double calculaGanhoAnual() {
		return this.salario * QTDE_MESES;
	}
	
	/**
	 * Verifica se o funcionario ainda trabaha na empresa
	 * 
	 * @return
	 * 		Verdadeiro = Trabalha
	 * 		Falso = Não trabalha
	 */
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	/**
	 * Configura o nome da Empresa
	 * 
	 * @param estaNaEmpresa
	 * 		Funcionario está ou não na empresa
	 */
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	/**
	 * Imprime as informações dos funcionarios
	 */
	public void mostra() {
		System.out.println("Funcionario: " + this.getNome()
					//+ "\nID do Funcionario: " + this.getId()
					+ "\nDepartamento: " + this.getDepartamento() 
					+ "\nRG: " + this.getRg()
					+ "\nData de Entrada: " + this.getDataEntrada()
					+ "\nSalario: " + this.getSalario()
					+ "\nGanho Anual: " + this.calculaGanhoAnual() + "\n");
	}
	
	/**
	 * Verifica se o funcionario foi demitido ou não
	 */
	public void demite(){
		if(estaNaEmpresa){
			System.out.println("O funcionario " + this.nome 
					+ " trabalha nesta empresa");
		} else {
			System.out.println("O funcionario " + this.nome 
					+ " nao trabalha mais nesta empresa");
		}
		
	}
	
}
