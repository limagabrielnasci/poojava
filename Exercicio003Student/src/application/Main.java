package application;

import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student aluno = new Student();

        System.out.print("Nome = ");
        aluno.nome = sc.nextLine();
        System.out.print("N1 = ");
        aluno.n1 = sc.nextDouble();
        System.out.print("N2 = ");
        aluno.n2 = sc.nextDouble();
        System.out.print("N3 = ");
        aluno.n3 = sc.nextDouble();

        double notaFinal = aluno.notaFinal();
        System.out.printf("NOTA FINAL = %.2f\n", notaFinal);

        aluno.aprovadoReprovado();

        sc.close();
    }
}
