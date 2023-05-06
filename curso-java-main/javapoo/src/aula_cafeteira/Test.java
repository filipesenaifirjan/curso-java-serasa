package aula_cafeteira;

public class Test {

	public static void main(String[] args) {
		
		Cafeteira cafeteira = new Cafeteira();
		cafeteira.setMarca("Arno");
		cafeteira.setModelo("A1");
		cafeteira.setTipo("Capsula");
		
		Cafeteira cafeteira2 = new Cafeteira();
		cafeteira.setMarca(cafeteira.getMarca());
		cafeteira.setModelo("Ph1");
		cafeteira.setTipo("filtro");
		
		
		System.out.println("Cafeteira:" + cafeteira.toString());
		System.out.println("Cafeteira2:" + cafeteira2.toString());
		 
		System.out.println("PI: " + Math.PI);
		 
	}

}
