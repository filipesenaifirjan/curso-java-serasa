package heranca.funcionarios;

public class Secretario extends Funcionario {

	private String agenda;
	private String email;
	
	public Secretario(String nome, String cpf, double salario, String agenda, String email) {
		super(nome, cpf, salario);
		this.agenda = agenda;
		this.email = email;
		
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	}


