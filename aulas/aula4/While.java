package aula4;

public class While {
    static void main() {

        int i = 0;
        while (i < 11 ){
            IO.println("nuemro: " + i);
            i+= 2;
        }

        int par = 1;
        while (par < 11){
            IO.println("numero: " + par);
            par+=2;
        }
    }
}