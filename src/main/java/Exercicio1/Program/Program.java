package Exercicio1.Program;

import Exercicio1.Pessoa.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Informe um nome: ");
        pessoa.setNome(sc.nextLine());
        System.out.print("Informe sua idade: ");
        pessoa.setIdade(sc.nextInt());

        System.out.println();
        System.out.println("SEU NOME E IDADE: ");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
