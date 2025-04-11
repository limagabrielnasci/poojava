package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dólar atual = ");
        double dol = sc.nextDouble();

        System.out.println("Quantos dólares vc quer comprar? ");
        double qtdComprar = sc.nextDouble();

        System.out.printf("Quanto vc vai pagar em reais = %.2f", CurrencyConverter.converter(dol, qtdComprar));

        sc.close();
    }
}
