public class pessoa {

    public String nome;
    protected  String sexo;
    public int idade;

    public pessoa(String nome, String sexo, int idade){
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
