package Exercicio1.Program;

import Exercicio1.Retangle.Retangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();

        System.out.println("Enter rectangle width and height: ");
        retangle.setWidth(sc.nextDouble());
        retangle.setHeight(sc.nextDouble());

        System.out.println("AREA = " + String.valueOf(retangle.Area()));
        System.out.println("PERIMETER = " + String.valueOf(retangle.Perimeter()));
        System.out.println("DIAGONAL = "+ String.valueOf(retangle.Diagonal()));
    }
}
