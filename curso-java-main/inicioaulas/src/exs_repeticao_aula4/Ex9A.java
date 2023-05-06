package exs_repeticao_aula4;

import javax.swing.JOptionPane;

public class Ex9A {

	public static void main(String[] args) {
		
		
		int menorIdadeDigitada = 0 ;
		String menorNome ="   ";
		
		 for (int i = 0 ; i <= 3; i++) {
			 
			 String nome = JOptionPane.showInputDialog("Digite seu nome");
		     int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		    
		    if(menorIdadeDigitada == 0 || idade <  menorIdadeDigitada) {
		    	menorIdadeDigitada = idade;
		    	menorNome = nome;
		    } 
		    JOptionPane.showMessageDialog(null, "Nome:  " + nome + "idade:  " + idade +
		    		                      "\nMenor idade Digitada: "  +  menorIdadeDigitada);	
		 }
		 JOptionPane.showMessageDialog(null, "Nome: " + menorNome + "idade:  " +  menorIdadeDigitada);
                 		                                                           	
		 }

	}

