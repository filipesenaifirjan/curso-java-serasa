package aulas5e6;

public class AppMetodoSubstring {

	public static void main(String[] args) throws Exception{
		//Metodo Substring
		
		/*String frase = " Botafogo  de futebol e regasta";
		
		System.out.println("Palavra destacada:"+ frase.substring(frase.indexOf("fu", 0)));
		System.out.println("Palavra destacada:"+ frase.substring (frase.indexOf (0 , 8)));
		*/
		
		/*String frase = "AL HIlal  baguncou a mulambada";
		
		int index = frase.indexOf("H");
		System.out.println(index);
		String fraseQuebrada = frase.substring(index);
		System.out.println(fraseQuebrada);
		String fraseQuebradaMaiuscula = fraseQuebrada.toUpperCase();
		
		System.out.println("Palavra destacada:"+ fraseQuebradaMaiuscula);*/
		
		String telefone = " Telefone: (21) 9 9999 - 9999";
		int indice = telefone.indexOf("(");
		String telefoneFormatado = telefone.substring(indice);
		System.out.println("Telefone:"+ telefoneFormatado);
		
		
		
		
		// B | o | t |a | f| o | g |o | d | e | f| u |t | e | b | o | l  |  e  |  r  | e |  g | a | t  | a | s |
		// 0   1   2   3  4  5   6  7   8   9  10 11  12 13  14   15  16   17    18   19   20  21   22  23   24
	}

}
