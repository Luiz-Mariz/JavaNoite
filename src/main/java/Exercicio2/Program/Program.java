package Exercicio2.Program;

import Exercicio2.Employee.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Gross salary: ");
        employee.setGrossSalary(sc.nextDouble());

        System.out.print("Tax: ");
        employee.setTax(sc.nextDouble());

        System.out.printf("%nEmployee: %s, R$ %.2f%n%n", employee.getName(), employee.NetSalary());

        System.out.print("Which percentage to increse salary? ");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.println();
        System.out.printf("Employee: %s, R$ %.2f", employee.getName(), employee.getGrossSalary());

    }
}
