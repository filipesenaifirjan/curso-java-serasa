package exs_condicionais_aula4;

import javax.swing.JOptionPane;

public class Ex6AnoNasc {

public static void main(String[] args) {
		
		 
		 
		 System.out.println("Digite ano de nascimento: ");
	     int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu ano de nascimento?"));
	     
	     int anoAtual = 2023 ;
	     int idade = anoAtual - anoNascimento;
	    
	     if (idade < 18) {
	    	 
	         int anosFaltando = 18 - idade;
	           JOptionPane.showMessageDialog(null,"Voce tem apenas "+ idade + anosFaltando + " anos para o alistamento militar.");
	           
	        } else {
	            int anosPassados = idade - 18;
	            JOptionPane.showMessageDialog(null,"Voce tem "+ idade + "anos. ja se passaram" + anosPassados +" anos do alistamento militar.");

	        }
	    }
	}
	     
		 
	
