package aulas_1_2tipos_primitivos;

import javax.swing.JOptionPane;

public class LeituraComGui {

	public static void main(String[] args) {
		
	  int idade = 0;
	   String aux = JOptionPane.showInputDialog("Insira uma idade");

	     idade = Integer.parseInt(aux);
	        
	     JOptionPane.showMessageDialog(null,"Idade digitada:"+ idade);
	    
	    
	
	}

}