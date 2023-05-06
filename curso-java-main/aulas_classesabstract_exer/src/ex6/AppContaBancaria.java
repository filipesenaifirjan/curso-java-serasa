package ex6;

public class AppContaBancaria {

	
	public static void main(String[] args) {
		System.out.println("---- App ContaPoupanca ----");
		
		ContaPoupanca  contaPoupanca  = new ContaPoupanca(0, null, null, 0);
		contaPoupanca.setNomeCliente("Cliente Conta Simples");
		contaPoupanca.setNumConta("22222");
		
		
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
		}else {
			System.out.println("Faltam alguns dias para seus rendimentos ser calculados");
		}
		
		
		System.out.println(contaPoupanca);

	}
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = "+conta.getSaldo()); 
		}else {
			System.out.println("Saldo insuficiente para Saque de " + valor +", saldo de ="+ conta.getSaldo());
		}
	}

}
