package datahora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	
	static final long MILIS_POR_DIA =  100 * 60 * 60 * 24;
	
	public static void main(String[] args) {
		
		String formato = "dd/MM/yy hh:mm:ss:SSS";
		DateFormat df =  new SimpleDateFormat(formato);
		
		Date date = new Date();
		/*long tempo = date.getTime();*/
		
		/*
		 * System.out.println("Milis:" + tempo );
		* System.out.println("Milis de um dia:" + MILIS_POR_DIA  );
		
		*System.out.println("Data:" + date );
		
		*Date date2 = new Date(date.getTime()+ (MILIS_POR_DIA * 10));
		*System.out.println("Data2:" + date2 );
		
		*StringBuilder sb = new StringBuilder();
		*sb.append("Milis");
		*sb.append(date.getTime());
		*sb.append("\nDias:");
		*sb.append(tempo/ MILIS_POR_DIA);
		*sb.append("\nMeses: ");
		*sb.append(tempo / MILIS_POR_DIA /30);
		*sb.append("\nAnos:");
		*sb.append(tempo / MILIS_POR_DIA /365);
		
	
		*System.out.println(sub.toString());
		*/
		
		StringBuilder sb =new StringBuilder();
		sb.append("Data Formatada:");
		sb.append(df.format(date));
		
		System.out.println(sb.toString());
		
	}

}
