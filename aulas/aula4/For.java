package aula4;

public class For {
    static void main() {

        // 1* inicia a variavel
        // 2* condiçao
        // 3* alteraçao de variavel

        for (int i = 0; i < 5; i++) {
            IO.println("O valor de i é: " + i);
        }
        // mostrar todos os numeros pares de 1 a 10
        for (int i = 0; i < 10; i++) {
            if ( i % 2 == 0){
                IO.println("par: " + i);
            }
        }
        // mostrar todos os numeros impares de 1 a 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                IO.println("impares: " + i);
            }
        }
    }
}

