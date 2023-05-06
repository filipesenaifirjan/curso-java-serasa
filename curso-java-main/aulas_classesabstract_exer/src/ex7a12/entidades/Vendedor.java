package ex7a12.entidades;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {}

	public Vendedor(int codigoSetor, double salarioBase, double imposto, String nome, String endereco,
			String telefone,double valorVendas) {
		super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
		this.valorVendas = valorVendas;
		
		
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		comissao= this.valorVendas * (20/100);
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double calculaSalario() {
		return getSalarioBase() + getComissao() - (getSalarioBase() * (getImposto() / 100));
	}
}
