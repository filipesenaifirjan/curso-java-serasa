package datahora;

import java.util.Calendar;
import java.util.Date;

public class Calendario {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();	
		Date hoje = new Date();
		
		cal.setTime(hoje);
		
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH) + 1);
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		
		int hora = cal.get(cal.HOUR_OF_DAY);
	    String msg ="";
	    
	    if(hora > 0 && hora < 12) {
	    	msg = "Bom dia";
	    	
	    }
	    else {
	    	msg = "Boa tarde";
	    }
		 System.out.println(msg);
		}

}
