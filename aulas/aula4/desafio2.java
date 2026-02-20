package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio2 {
    static void main() {

        Scanner telclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList();
        IO.println("digite seu primeiro numero");
        int num = telclado.nextInt();
        IO.println();

        IO.println("digite seu segundo numero");
        int nuM = telclado.nextInt();

        numeros.add(num + nuM);
        IO.println(numeros);

    }
}
