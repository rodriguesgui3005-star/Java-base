package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    static void main() {

        List<String> nomes = new ArrayList();

        nomes.add("guilherme");
        nomes.add("cristhian");
        nomes.add("daniel");
        IO.println(nomes);
        IO.println(nomes.get(0));
    }
}

