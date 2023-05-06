package utilizacaoArrays;


public class Vetor2 {


	public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	int id_idades [][] = new int [2] [2];
	
	String frutas[] = new String[5];
	String frutas2[] = {"Banana","Maçã","Uva","Maracuja","Morango"};
	@SuppressWarnings("unused")
	int idades[] = {1, 5, 70, 85,};
	frutas = frutas2;
	
	System.out.println(frutas[3]);
	
	
	
	for(int i = 0; i < frutas2.length; i++);{
		int i =0;
		if(frutas2[i].equals("Banana")) {
			System.out.println("Frutas:" +frutas2[i]);
		}
	}
	
	for(String fruta : frutas2) {
		if(fruta.equals("Banana"))
		System.out.println("Frutas:" + fruta);
	}
	
	imprimeTexto("Texto a imprimir");
	imprimeTexto();
	
	
	System.out.println("Ano Nascimento:" + calculaAnoNascimento(34, 2023));
}
	

	public static void imprimeTexto() {
		System.out.println("-------------------");
	}
	
	public static void imprimeTexto(String texto) {
		System.out.println(texto);
		
	}	
	private static int calculaAnoNascimento(int idade, int anoAtual) {
		return anoAtual - idade;
	}
}
