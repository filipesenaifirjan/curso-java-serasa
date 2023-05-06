package aulas_1_2tipos_primitivos;

import java.util.Scanner;

public class LeituraDeDados1 {

	public static void main(String[] args) {
		
		int idade = 0;
		
		try (Scanner scan = new Scanner(System.in)){
		
		System.out.println("Insira sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("A idade digitada foi: " + idade);
		
	}

}
}