public class gato {
    public String raca;
    public  int idade;
    public String cor;
    public  String nome;

    public gato(String nome, String raca, String cor, int idade){
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.nome = nome;
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
