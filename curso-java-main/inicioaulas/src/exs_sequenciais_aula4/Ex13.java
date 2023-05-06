package exs_sequenciais_aula4;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);

	        System.out.println("Digite o salário do funcionário: ");
	        double salario = scan.nextDouble();

	        double aumento = salario * 0.15;
	        double novoSalario = salario + aumento;

	        System.out.println("O novo salário do funcionário é: " + novoSalario);

	        scan.close();
	    }
	}
