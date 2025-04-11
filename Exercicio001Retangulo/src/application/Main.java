package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        System.out.println("AREA = " + rect.Area());
        System.out.println("PERIMETER = " + rect.Perimeter());
        System.out.println("DIAGONAL = " + rect.Diagonal());
        sc.close();
    }
}
