package exs_repeticao_aula4;

public class Ex2Soma {
 /*Escreva um algoritmo que calcule
  *  a soma dos numeros de 1 a 15.
  
  */
	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 1; i <= 15; i++) {
			soma += i;
		}
		System.out.println("A soma dos números de 1 a 15 é : " + soma);
		
	}

}
