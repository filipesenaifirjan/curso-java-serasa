
package exerciciosAulas1_2;

import javax.swing.JOptionPane;

public class Ex03_Aula2_Tabuada {
	
	
	// Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário 
	// fornece o número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.

	 public static void main(String[] args) {
		
		    String input = JOptionPane.showInputDialog(null, "Insira um número desejado:");
		        int number = Integer.parseInt(input);

		        String mensagem = "";
		        for (int i = 1; i <= 10; i++) {
		            int resultado = number * i;
		            mensagem += number + " x " + i + " = " + resultado + "\n";
		        }

		        JOptionPane.showMessageDialog(null, mensagem);
		    }
		}