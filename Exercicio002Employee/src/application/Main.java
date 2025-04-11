package application;

import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        double percentage;
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", emp.name, emp.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.printf("Updated data: %s, $ %.2f", emp.name, emp.NetSalary());
    }
}