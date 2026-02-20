package aula3;

import java.util.Scanner;

public class calculodemedia {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("digite sua primeira nota");
        double notaUm = sc.nextDouble();

        IO.println("digite sua segunda nota");
        double notaDois = sc.nextDouble();

        IO.println("digite sua terceira nota");
        double notaTres = sc.nextDouble();

        double mediageral = (notaUm + notaDois + notaTres) / 3;

        if (mediageral < 4){
            IO.println("reprovado");
        } else if (mediageral <= 6) {
            IO.println("recuperaçao");
        } else
            IO.println("aprovado");
            IO.println(mediageral);
    }
}
