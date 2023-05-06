package collection.entidades;

public class Aluno {
	
	private String nome;
	private String curso;
	private int num;
	
	public Aluno(String nome, String curso, int num) {
		
		this.nome = nome;
		this.curso = curso;
		this.num = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
