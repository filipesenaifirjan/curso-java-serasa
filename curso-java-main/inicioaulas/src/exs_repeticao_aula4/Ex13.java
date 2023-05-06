package exs_repeticao_aula4;

import javax.swing.JOptionPane ;

public class Ex13 {
	/*Faça um algoritmo que leia 20 vezes numeros e, ao final, 
	 * escreva quantos estão entre 0 e 100*/


	public static void main(String[] args) {
	        /*13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
	              100. */
	       
		int somaNumerosQueEstaoEntre0E100 = 0;
	        
		for(int i = 0; i < 4; i++) {
	           
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	            if( num >= 0 && num <= 100){
	            	 somaNumerosQueEstaoEntre0E100++;
	            }
	        }
	        System.out.println("Temos: " +  somaNumerosQueEstaoEntre0E100 + " entre 0 e 100");
	    }
	}