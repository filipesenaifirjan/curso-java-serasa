package exs_repeticao_aula4;

import javax.swing.JOptionPane ;

        /*Leia a idade de 20 pessoas e exxiba quantas
        * pessoas sao maiores de idade*/

 public class Ex8 {

	   public static void main(String[] args) {
		 
		   int somaQtPessoasMaioresDeIdade = 0;
		   
	        for(int i = 0; i < 4; i++) {
	            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
	            if(idade >= 18) {
	            	somaQtPessoasMaioresDeIdade++;
	            }
	        }
	        System.out.println("Soma total de pessoas maiores de idade: " + somaQtPessoasMaioresDeIdade);
	    }
	}