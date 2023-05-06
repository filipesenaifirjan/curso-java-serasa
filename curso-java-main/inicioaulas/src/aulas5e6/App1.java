package aulas5e6;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma msg");
		String msg = scan.next();
		
		System.out.println();
		System.out.println("Player:" + msg.replace("sexo","-----" ));
		
		
	}

}
