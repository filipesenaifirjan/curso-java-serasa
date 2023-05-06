package classesabstracts;

public class App {

		public static void main(String[] args) {
			
				Automovel  automovel = new  Automovel();
			    Aviao aviao = new  Aviao();
				 
				 System.out.println("Automovel:" + automovel.isStatus());
				 automovel.ligar();
				 System.out.println("Automovel:" + automovel.isStatus());
				 
				 System.out.println("Automovel:" + automovel.getVelocidade());
				 automovel.acelerar();
				 System.out.println("Automovel:" + automovel.getVelocidade() + "km/h");
				 
		
				
				 System.out.println("Aviao:" + aviao.isStatus());
				 aviao.ligar();
				 System.out.println("Aviao:" + aviao.isStatus());
				 
				 System.out.println("Aviao:" + aviao.getVelocidade());
				 aviao.acelerar();
				 System.out.println("Aviao:" + aviao.getVelocidade() + "km/h");
	            }

	}



