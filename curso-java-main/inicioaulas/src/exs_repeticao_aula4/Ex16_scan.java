package exs_repeticao_aula4;

import java.util.Scanner;

public class Ex16_scan {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia 20 vezes numeros e, ao final, 
		 * escreva quantos estão entre 0 e 100*/

			Scanner scan = new Scanner(System.in);
		    
	        int contador = 0;
	    
	        for (int i = 1; i <= 4; i++) {
	          System.out.println("Digite o "+ i +"º número: ");
	          int num = scan.nextInt();
	    
	          if (num >= 0 && num <= 100) {
	            contador++;
	          }
	        }
	    
	        System.out.println(contador+ " números estão entre 0 e 100.");
	    
	        scan.close();
	      }
	}
	