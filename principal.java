package exercicio1;

import java.util.Scanner;

public class principal {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("digite seu nome");
        String nome = sc.next();
        IO.println("digite a raca");
        String raca = sc.next();
        IO.println("digite a idade");
        int idade = sc.nextInt();
        IO.println("digite a cor");
        String cor = sc.next();

        cachorro cachorro = new cachorro(raca,nome,cor,idade);

        gato gato = new gato(raca,idade,cor,nome);
    }
}
