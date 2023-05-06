package aulas5e6;



import java.util.Locale;

import javax.swing.JOptionPane;

public class Localizacao {

	public static void main(String[] args) {
	   Locale local = Locale.getDefault();
		
		
		JOptionPane.showMessageDialog(null, "Configuracoes do SO: "
		                               + "\nSigla:" + local.getCountry()
		                               + "\nPais:" + local.getDisplayCountry()
		                               + "\nIdioma:" + local.getDisplayLanguage()
		                               + "\nDisplay Name:" + local.getDisplayName()
		                               + "\nISO:" + local.getISO3Country());
		System.exit(0);
	}

}
