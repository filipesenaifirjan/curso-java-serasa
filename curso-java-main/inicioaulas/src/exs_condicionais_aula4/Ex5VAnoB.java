package exs_condicionais_aula4;

import java.util.Scanner;

   public class Ex5VAnoB {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite  ano a ser vereficado: ");
		
         int ano = scan.nextInt();
		
		if (( ano % 4  == 0 && ano %  100 != 0) || (ano % 400 == 0)) {
			
			System.out.println(" Ano " + ano + "  é bissexto.");
			
		}else {
			
			System.out.println(" Ano " + ano + " não  é bissexto. ");
				
		}
		
		 scan.close();

		
	}

}
