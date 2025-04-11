package application;

import entities.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Número da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do dono da conta: ");
        String titularConta = sc.nextLine();
        System.out.print("Vai ter depósito inicial? (s/n)? ");
        char op = sc.next().charAt(0);

        if (op == 'n') {
            System.out.println();
            System.out.println("Dados da conta: ");
            conta = new ContaBancaria(numConta, titularConta);
            System.out.println(conta);
        }
        if (op == 's') {
            System.out.print("Depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            System.out.println();
            System.out.println("Dados da conta: ");
            conta = new ContaBancaria(numConta, titularConta, depositoInicial);
            System.out.println(conta);
        }

        System.out.println();
        System.out.print("Entre com o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor do saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println(conta);

        sc.close();

    }
}
