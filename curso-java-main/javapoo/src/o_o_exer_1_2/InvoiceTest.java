package o_o_exer_1_2;

import java.text.DecimalFormat;
import java.util.Locale;

@SuppressWarnings("unused")
public class InvoiceTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();

        Invoice invoice = new Invoice(20004, "SamsungA20", 3, 3000.00);
        df.applyPattern("R$ #,##0.00");
        System.out.println("Descricao do Produto: " + invoice.getDescricaoItem());
        System.out.println("Quantidade Comprada: " + invoice.getQuantidadeCompradaItem());
        System.out.println("Preço Unitário" + df.format(invoice.getPrecoUnitarioItem()));
        System.out.println("Valor da Nota: " + df.format(invoice.getInvoiceAmount()));
    }
}