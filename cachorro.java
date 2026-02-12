package exercicio1;

public class cachorro {

    public String raca;
    public  int idade;
    public String cor;
    public  String nome;

    public cachorro(String raca, String cor, String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "cachorro{" +
                "raca='" + raca + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
