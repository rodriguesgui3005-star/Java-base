package exercicio1;

public class gato {

    public String raca;
    public  int idade;
    public String cor;
    public  String nome;

    public gato(String nome, int idade, String raca, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "gato{" +
                "raca='" + raca + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}