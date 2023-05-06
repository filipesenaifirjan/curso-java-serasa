package ex6;

public class ContaEspecial extends ContaBancaria {
	
	
	private double limite;

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		
		return "ContaEspecial [limite=" + limite + "]";
	}
	public boolean sacar (double valor) {
		double saldoComLimite =  this.getSaldo()+ limite;
		
		if((saldoComLimite-valor) >=0) {
		this.setSaldo (this.getSaldo()- valor);
		return  true;
		}
		return false;
	}

}
