package ex7a12.entidades;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
   public Fornecedor (){}
   
   public Fornecedor(double valorCredito, double valorDivida, String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double obterSaldo() {
		return this.valorCredito - valorDivida;
	}
	

}
