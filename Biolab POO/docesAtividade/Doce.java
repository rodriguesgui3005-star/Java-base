package doce;

public class Doce {

    private String nome;
    private String cor;
    private String peso;

    public String cobertura(){
        return "chocolate";
    }

    public String massa(){
        return "fuba";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}
