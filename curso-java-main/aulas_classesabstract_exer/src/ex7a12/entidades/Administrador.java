package ex7a12.entidades;

public class Administrador extends Empregado{
	
	private double ajudaDeCusto;
		
	public Administrador() {}

	

	public Administrador(int codigoSetor, double salarioBase, double imposto, String nome, String endereco,
			String telefone, double ajudaDeCusto) {
		super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
		this.ajudaDeCusto =ajudaDeCusto;
	}



	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
   
	public double calculaSalario() {
		return getSalarioBase() + ajudaDeCusto - (getSalarioBase() *(getImposto() / 100));
	}
	
}
