package exs_sequenciais_aula4;

import java.util.Scanner;

   public class Ex10 {

	public static void main(String[] args) {
		
		        Scanner scan = new Scanner(System.in);

		        System.out.println("Digite a largura da parede em metros: ");
		        double largura = scan.nextDouble();

		        System.out.println("Digite a altura da parede em metros: ");
		        double altura = scan.nextDouble();

		        double area = largura * altura;
		        double litrosTinta = area / 2;

		        System.out.printf("A área a ser pintada é de "+area+" metros quadrados.");
		        System.out.printf("Serão necessários "+litrosTinta+" litros de tinta para a pintura\n");

		        scan.close();
		      }
	

	}


