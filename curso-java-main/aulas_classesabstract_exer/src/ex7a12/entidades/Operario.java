package ex7a12.entidades;

public class Operario extends Empregado {
	
	private double valorProducao;
	private double comissao;
	
	public Operario() {}

	public Operario(int codigoSetor, double salarioBase, double imposto, String nome, String endereco,
			String telefone,double valorProducao) {
		super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
		this.valorProducao = valorProducao;
		
		
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		comissao = this.valorProducao * (20/100);
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double calculaSalario() {
		return getSalarioBase() + getComissao() - (getSalarioBase() *(getImposto() / 100));
	}
       
}
