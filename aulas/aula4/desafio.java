package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList();
        IO.println("digite um numero");
        int num = teclado.nextInt();
        numeros.add(num);
        IO.println(numeros);
    }
}
