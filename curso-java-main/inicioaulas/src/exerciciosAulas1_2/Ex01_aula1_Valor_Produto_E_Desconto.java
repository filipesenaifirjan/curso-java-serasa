package exerciciosAulas1_2;

import javax.swing.JOptionPane;

public class Ex01_aula1_Valor_Produto_E_Desconto {
	

	  /* 1 -Execicio Aula_2 
	   * Crie uma classe que receba o valor de um produto e a 
    porcentagem de desconto, calcule e mostre o valor do desconto 
    e o valor do produto com o desconto. Observação: o valor do desconto 
    é calculado por meio da fórmula: 
    valor do desconto = valor do produto * percentual de desconto / 100. */
	
		 public static void main(String[] args) {
		     double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:" ));
		    	
		      int desconto  = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do desconto:"));
		      
		      double total = valor * desconto / 100;
		             total = valor - total;
		             
		             JOptionPane.showMessageDialog(null, "O valor a pagar é : " + total);
		    
		}

}