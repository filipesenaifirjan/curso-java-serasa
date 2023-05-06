package aula0708;



public class Vetor1 {

	public static void main(String[] args) {
		
		

		String frutas[] = new String[5];
		String frutas2[] =  {"Banana", "Maça"," Uva", "Maracuja", "Morago"};
		frutas = frutas2;
		
		System.out.println(frutas[3]);
		
		for (int i = 0; i < frutas2.length; i ++) {
			if(frutas2[i].equals("Banana")) {
				System.out.println("Fruta:" + frutas2[1]);
			}
		}
		
		for (String fruta: frutas2){
			if(fruta.equals("Banana")|| fruta.equals("Morango")) 
				System.out.println("Fruta:" + fruta);
			
			}
		    
		    for (int i = 0; i < 2; i++) {
			    for(int j = 0 ; j < 2 ; j++);{
		}
	}
 ///public void imprimeTexto(String texto)	;	    
 }
}	