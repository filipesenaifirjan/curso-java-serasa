package o_o_exer_1_3;

import java.text.DecimalFormat;

public class TestEmpregado {

	public static void main(String[] args) {

		//Crie um DecimalFormat para fazer a formatação de moeda corretamente
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        //O exercício pede para instanciar dois empregados
        Empregado empregado1 = new Empregado("Antonio", "Souza", 4000.00);
        System.out.println("Empregado: " + empregado1.getNome() + " " + empregado1.getSobrenome() + " Salário mensal: " + df.format(empregado1.getSalarioMensal()) + "Salário anual: " + df.format(empregado1.getSalarioAnual()));
        Empregado empregado2 = new Empregado("José", "Silva", 8000.00);
        System.out.println("Empregado: " + empregado2.getNome() + " " + empregado2.getSobrenome() + " Salário mensal: " + df.format(empregado2.getSalarioMensal())  + "Salário anual: " + df.format(empregado2.getSalarioAnual()));

        //Pede para darmos a cada empregado um aumento de 10%
        //Para isso foi criado um método na classe empregado que fará esse calculo e setará o novo salario de cada empregado
        empregado1.setAumento();
        System.out.println("Empregado: " + empregado1.getNome());
        System.out.println("Novo salário mensal: " + df.format(empregado1.getSalarioMensal()));
        System.out.println("Novo salário anual: " + df.format(empregado1.getSalarioAnual()));

        empregado2.setAumento();
        System.out.println("Empregado: " + empregado2.getNome());
        System.out.println("Novo salário mensal: " + df.format(empregado2.getSalarioMensal()));
        System.out.println("Novo salário anual: " + df.format(empregado2.getSalarioAnual()));
    }


	}


