public class cachorro {

    public String raca;
    public  int idade;
    public String cor;
    public  String nome;

    public cachorro(String nome, String raca, String cor, int idade) {
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.nome = nome;
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
