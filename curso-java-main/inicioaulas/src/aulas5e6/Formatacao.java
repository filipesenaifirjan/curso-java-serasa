package aulas5e6;

import java.text.DecimalFormat;

public class Formatacao {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		float pagamento = 2583.75f;
		
		System.out.println("Bruto: " + pagamento);
		
		df.applyPattern("R$ # , ##0.00"); 
		System.out.println("Pagamento: " + df.format(pagamento));
		
		
		String formatado = df.format(pagamento);
		System.out.println("Pagamento formatado: " + formatado);
	}

}
