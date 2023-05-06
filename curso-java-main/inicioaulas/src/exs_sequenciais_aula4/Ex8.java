package exs_sequenciais_aula4;

import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma distância em metros: ");
        double metros = scan.nextDouble();

        double Km = metros / 1000;
        double Hm = metros / 100;
        double Dam =metros / 10;
        double dm = metros * 10;
        double cm = metros * 100;
        double mm = metros * 1000;

        System.out.println("A distância de " + metros + "m corresponde a:");
        System.out.println(Km + "Km");
        System.out.println(Hm + "Hm");
        System.out.println(Dam + "Dam");
        System.out.println(dm + "dm");
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");

        scan.close();
      }
}
