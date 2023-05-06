package heranca;

import heranca.funcionarios.Diretor;
import heranca.funcionarios.Engenheiro;
import heranca.funcionarios.Gerente;
import heranca.funcionarios.Secretario;

public class App {

	public static void main(String[] args) {
		
       
		Gerente gerente = new Gerente("José da Silva","111222333444", 4000.00, 1234, 15);
		Diretor diretor = new Diretor("Maria Lira","23245678989", 10000.00, "superSenha" );
		Secretario secretario = new Secretario("Lauro linhares", "56787987970", 3000.00, "Agenda1", "sec@secretariando.com");
		Engenheiro engenheiro = new Engenheiro ("Carlos Roberto","321456567-67", 18000.00,"12356-7","109-8");
		
		System.out.println("Salário Gerente:" + gerente.getSalario());
		System.out.println("Salário Diretor:" + diretor.getSalario());
		System.out.println("Salário Secretario:" + secretario.getSalario());
		System.out.println("Salário Engenheiro:" + engenheiro.getSalario());
		
		System.out.println("Bonificacao Gerente:" + gerente.getBonificacao ());
		System.out.println("Bonificacao Diretor:" + diretor.getBonificacao ());
		System.out.println("Bonificacao Secretario:" + secretario.getBonificacao ());
		System.out.println("Bonificacao  Engenheiro:" + engenheiro.getBonificacao ());
	}

}
