package ex5;

public class IngressoVip  extends Ingresso{

	private double valorAdicional;
	
	public IngressoVip() {}

	public IngressoVip(double valorAdicional, double valor) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "IngressoVip [valor ingresso=" + (getValor()+ valorAdicional )+ "]";
	}

	
	
	
}
