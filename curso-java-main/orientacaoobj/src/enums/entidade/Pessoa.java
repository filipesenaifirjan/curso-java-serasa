package enums.entidade;

import enums.CorPele;
import enums.EstadoCivil;
import enums.Sexo;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;
	private String rg;
	private String cpf;
	private Endereco endereco;
	private Sexo sexo;
	private CorPele corPele;
	private EstadoCivil estadoCivil;
	
	public Pessoa() {}

	public Pessoa(String nome, String sobreNome, int idade, String rg, String cpf, Endereco endereco, Sexo sexo,
			CorPele corPele, EstadoCivil estadoCivil) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
		this.corPele = corPele;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public CorPele getCorPele() {
		return corPele;
	}

	public void setCorPele(CorPele corPele) {
		this.corPele = corPele;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", rg=" + rg + ", cpf=" + cpf
				+ ", endereco=" + endereco + ", sexo=" + sexo + ", corPele=" + corPele + ", estadoCivil=" + estadoCivil
				+ "]";
	}
	
	

}
