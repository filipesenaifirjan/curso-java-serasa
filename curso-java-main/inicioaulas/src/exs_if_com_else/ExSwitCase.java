package exs_if_com_else;

import javax.swing.JOptionPane;

public class ExSwitCase {

	public static void main(String[] args) {
		String mes =JOptionPane.showInputDialog("Forneça o numero do mês");
		if (mes != null) {
			
			switch (mes) {
			
			    case "1":
			    	mes ="Janeiro";
			    	break;
			    	
			    case "2":
			    	mes ="Fevereiro";
			    	break;
			    	
			    case "3":
			    	mes ="Março";
			    	break;
			    	
			    case "4":
			    	mes ="Abril";
			    	break;
			    default:
			    	mes = "Mes desconhecido!";
			    	
			}  	
             JOptionPane.showMessageDialog(null, mes);
			
        }
        System.exit(0);
	}     
}   