package heranca.funcionarios;
//aula 11-13/03/2023
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return this.salario * 0.10;
		
	}
	
	
}
