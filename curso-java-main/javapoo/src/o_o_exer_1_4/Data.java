package o_o_exer_1_4;

import java.time.LocalDate;

import java.util.Date;
import java.util.Locale;
@SuppressWarnings("unused")
public class Data {
	
	private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {

        //Se o mes for fevereiro e for passado um valor di dia maior que 29 o que é inválido para o mês eu lanço uma exceção
        if(mes == 2) {
            if (dia > 29)
                throw new IllegalArgumentException("Não pode haver dias maiores que 29 em fevereiro");
        }
        if(dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Você deve lançar um valor válido para o dia do mês. Entre 1 e 31");
        }
        this.dia = dia;

        //Se for passado um valor inválido para o mês eu lanço uma exceção
        if(mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Você deve lançar um mês entre 1 e 12");
        }
        this.mes = mes;

        if(ano < 0) throw new IllegalArgumentException("Você deve lançar um valor válido para o ano");
        this.ano = ano;
    }

    public Data(){
        LocalDate now = LocalDate.now();
        this.setDia(now.getDayOfMonth());
        this.setMes(now.getMonth().getValue());
        this.setAno(now.getYear());
    }

    @Override
    public String toString() {
        return "Data{" + dia + "/" + mes + "/" + ano +'}';
    }

    public void avancarUmDia(){
        this.setDia(this.getDia() + 1);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}


