package entities;

public class ContaBancaria {

    // encapsulando
    private int numConta;
    private String titularConta;
    private double saldo;
    private static final double TAXA = 5.0;

    public ContaBancaria() {

    }

    // construtor caso não tenha deposito inicial
    public ContaBancaria(int numConta, String titularConta) {
        this.numConta = numConta;
        this.titularConta = titularConta;
    }

    public ContaBancaria(int numConta, String titularConta, double saldo) {
        this.numConta = numConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    // apenas get para o número da conta pois não pode ser alterado
    public int getNumConta() {
        return numConta;
    }

    // o nome pode alterar devido a casamento, etc
    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    // apenas get para o deposito pois não pode ser alterado, apenas por métodos
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        double total = valor + TAXA;
        saldo -= total;
    }

    public String toString() {
        return "Conta "
                + getNumConta()
                + ", Dono: "
                + getTitularConta()
                + ", Saldo: "
                + getSaldo();
    }
}
