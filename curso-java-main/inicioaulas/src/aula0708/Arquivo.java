package aula0708;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Arquivo {
    private static final String CAMINHO = "C:/Dev/frases.txt";
    
	public static void main(String[] args)throws IOException {
		
		String frase = JOptionPane.showInputDialog("Entre com uma frase");
		
		try {
			FileWriter file = new FileWriter(CAMINHO, true);
			PrintWriter out = new PrintWriter(file);
			out.print(frase);
			file.close();
			out.close();
			JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo");
			
		}catch (FileNotFoundException erro) {
			JOptionPane.showMessageDialog(null, "Erro, verifica se o caminho do arquivo está correto");
			
		}
		
	}

}
