package doce;

public class DoceMain {
    static void main() {

        Torta torta = new Torta();

        IO.println(torta.cobertura());

        IO.println(torta.massa());

        Bolo bolo = new Bolo();

        IO.println(bolo.cobertura());

        IO.println(bolo.massa());
    }
}
