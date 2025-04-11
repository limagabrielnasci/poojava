package entities;

public class Student {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double notaFinal() {
        return n1 + n2 + n3;
    }

    public void aprovadoReprovado() {
        double notaF = notaFinal();
        if (notaF >= 60) {
            System.out.println("PASSOU");
        } else {
            System.out.printf("REPROVOU\nFaltou %.2f pontos!", 60 - notaF);
        }
    }

}
