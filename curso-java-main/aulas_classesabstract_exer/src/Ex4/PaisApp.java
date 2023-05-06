package Ex4;

public class PaisApp {

	public static void main(String[] args) {
		
		
		Pais pais1 = new Pais("13360-1", "Italia", 12345645.4564);
		pais1.setPopulacao(5900000);
		pais1.getPaisesFronteiricos().add("França");
		pais1.getPaisesFronteiricos().add("Suica");
		pais1.getPaisesFronteiricos().add("Austria");
		pais1.getPaisesFronteiricos().add("Eslovênia");
		
		
		Pais pais2 = new Pais("13360-1", "França", 12345645.4564);
		pais2.setPopulacao(6800000);
		pais2.getPaisesFronteiricos().add("Espanha");
		pais2.getPaisesFronteiricos().add("Suiça");
		pais2.getPaisesFronteiricos().add("Alemmanha");
		pais2.getPaisesFronteiricos().add("Belgica");
		pais2.getPaisesFronteiricos().add("Inglaterra");
		pais2.getPaisesFronteiricos().add("Brasil");
		
		
		System.out.println("Densidade Populacional" + pais1.getNome()+": "+ pais1.getDensidadePopulacional());
		System.out.println("Densidade Populacional" + pais2.getNome()+ ":" + pais2.getDensidadePopulacional());
		
		System.out.println("É limitrofe? :" + pais1.isLimitrofe("Eslovenia"));
		System.out.println("É limitrofe? :" + pais2.isLimitrofe("Brasil"));
		
		
	}


}