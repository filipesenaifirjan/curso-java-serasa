package aulas5e6;

import javax.swing.JOptionPane;

public class MetodoReplace {

	public static void main(String[] args) {
		// Metodo Replace
		
		String frase = " O cachorro faz auau, o gato miau, e a galinha cocó";
		
		//System.out.println("Digite o valor procurado");
		//String procurado = scan.next();
		
		//String frasefraseComSubstituicao = frase.replace("cachorro","lobo");
		
		String procurado = JOptionPane.showInputDialog(null,"digite o valor  procurado");
		String aSubstituir =JOptionPane.showInputDialog(null,"digite o valor que vai substituir");
		String frasefraseComSubstituicao = frase.replace( procurado, aSubstituir);
		
		
	     System.out.println("Frase:" + frase);
		 System.out.println("Frase com a troca:" + frasefraseComSubstituicao );
		
		
	}

}
