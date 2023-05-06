package o_o_exer_1_2;

import java.text.DecimalFormat;
import java.util.Locale;

@SuppressWarnings("unused")
public class Invoice {

    private int codigoItem;
    private String descricaoItem;
    private int quantidadeCompradaItem;
    private double precoUnitarioItem;

    public Invoice(int codigoItem, String descricaoItem, int quantidadeCompradaItem, double precoUnitarioItem) {
        this.codigoItem = codigoItem;
        this.descricaoItem = descricaoItem;
        if(quantidadeCompradaItem < 0)
            this.quantidadeCompradaItem = 0;
        else this.quantidadeCompradaItem = quantidadeCompradaItem;
        if(precoUnitarioItem < 0)
            this.precoUnitarioItem = 0.0;
        else this.precoUnitarioItem = precoUnitarioItem;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeCompradaItem() {
        return quantidadeCompradaItem;
    }

    public void setQuantidadeCompradaItem(int quantidadeCompradaItem) {
        this.quantidadeCompradaItem = quantidadeCompradaItem;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

    public double getInvoiceAmount(){

        return getQuantidadeCompradaItem() * getPrecoUnitarioItem();
    }
}
