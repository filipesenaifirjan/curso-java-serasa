package aulas_1_2tipos_primitivos;

import javax.swing.JOptionPane;

public class Condicionais {

	public static void main(String[] args) {
		
		Object[]opcoes = {"Masculino", "Feminino"};
		String resposta = (String)JOptionPane.showInputDialog(null,"Selecione o sexo:\n","Pesquisar",
				JOptionPane.PLAIN_MESSAGE,null,opcoes,"Masculino");
		
		
		if(resposta == null) {
			JOptionPane.showMessageDialog(null, "Você pressionou cancel");	
		}
        if(resposta == "Masculino") {
        	JOptionPane.showMessageDialog(null, "Você selecionou o sexo Masculino");
        	
        }
        if(resposta == "Feminino") {
        	JOptionPane.showMessageDialog(null, "Você selecionou o sexo Feminino");
        
        }
        System.exit(0);
	}     
}   
        	