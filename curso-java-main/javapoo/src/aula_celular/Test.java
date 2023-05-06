package aula_celular;

public class Test {
	
	public static void main (String [] args) {

		Celular celular = new Celular();
		 celular.altura  = 10;
		 celular.largura = 8 ;
		 celular.marca = "Samsung";
		 celular.modelo = "Galaxy A89";


			Celular celular2 = new Celular();
			 celular2.altura  = 15;
			 celular2.largura = 10 ;
			 celular2.marca = "Apple";
			 celular2.modelo = "Iphone 11";
           
			 System.out.println("Celular 1:" + celular.toString());
			 System.out.println("Celular 2:" + celular2.toString());
				
		
	}
	

}
