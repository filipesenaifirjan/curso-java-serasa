package aulas_1_2tipos_primitivos;

import javax.swing.JOptionPane;

public class LeiturasDeDados2 {

	public static void main(String[] args) {
	
		int idade = 0;
		
		idade =  Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: " ));
		System.out.println("Idade digitada foi: " + idade);
	}

}
