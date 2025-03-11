package Exercicio3.Program;

import Exercicio2.Employee.Employee;
import Exercicio3.Nota.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Student name: ");
        student.setName(sc.nextLine());

        System.out.println("Insert three quarter notes in sequence: ");
        student.setNota1(sc.nextDouble());
        student.setNota2(sc.nextDouble());
        student.setNota3(sc.nextDouble());

        System.out.println("FINAL GRADE = " + student.SumNote());
        System.out.println(String.valueOf(student.Approved()));
        student.PontosFaltantes(student.Approved());

    }
}
