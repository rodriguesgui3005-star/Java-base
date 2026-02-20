package exercicio2;

public class Vaca {

    public String nome;
    private String leite;
    public int filhos;

    public void mugir() {
        IO.println("Muuuuuuuuuuuuuuuuh");
    }

    public int bezzero() {
        filhos = filhos + filhos;
        return filhos;
    }

    public Vaca() {
    }

    public Vaca(String nome, String leite, int filhos) {
        this.nome = nome;
        this.leite = leite;
        this.filhos = filhos;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "nome='" + nome + '\'' +
                ", leite='" + leite + '\'' +
                ", filhos=" + filhos +
                '}';
    }
}

