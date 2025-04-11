package util;

public class CurrencyConverter {

    public static double converter(double dol, double qtd) {
        double conversao = dol * qtd;
        return conversao * 1.06;
    }

}
