package ex6;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;

	public ContaPoupanca(int diaRendimento , String nomeCliente,String numConta, double saldo ) {
		super();
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}
     
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo()* taxaRendimento));
		   return true;
		}
		return false;
		
	}
	

	
	

}
	
	