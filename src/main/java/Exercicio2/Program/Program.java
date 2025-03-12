package Exercicio2.Program;

import Exercicio2.ContaBancaria.ContaBancaria;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.print("Informe o titular: ");
        contaBancaria.setTitular(sc.nextLine());
        System.out.print("Informe o saldo: ");
        contaBancaria.setSaldo(sc.nextDouble());

        System.out.println();
        System.out.print("Deseja depositar (s/n): ");
        boolean confirmacaoedDeposito = contaBancaria.ConfirmacaoDeposito(sc.next().charAt(0));
        contaBancaria.Depositar(confirmacaoedDeposito);

        System.out.println();
        System.out.print("Deseja sacar (s/n): ");
        boolean confirmacaoSaque = contaBancaria.ConfirmacaoSaque(sc.next().charAt(0));
        contaBancaria.Sacar(confirmacaoSaque);

        System.out.println("Saldo final: " + contaBancaria.getSaldo());
        sc.close();
    }
}
