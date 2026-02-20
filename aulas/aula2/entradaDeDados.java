package aula2;

import java.util.Scanner;

public class entradaDeDados {
    static void main() {

    Scanner sc = new  Scanner(System.in);
        IO.println("digite seu nome");
        String nome = sc.next();

        IO.println("digite seu altura ");
        double altura = sc.nextDouble();

        IO.println("digite seu idade");
        int idade = sc.nextInt();

        IO.println("digite seu kg");
        double peso = sc.nextDouble();

        IO.println("seu imc é");
        IO.println(peso/(altura*altura));

    }
}