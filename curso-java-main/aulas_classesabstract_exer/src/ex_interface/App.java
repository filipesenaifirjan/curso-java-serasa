package ex_interface;

public class App {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente ();
		@SuppressWarnings("unused")
		Vendedor vendedor = new Vendedor();

		@SuppressWarnings("unused")
		Assistente assistente = new  Assistente();
		
		
		 System.out.println("Gerente:" + gerente );
		
	}

}
