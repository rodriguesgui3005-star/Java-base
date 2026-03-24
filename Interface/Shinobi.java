package Interface;

abstract class Shinobi {
    private String nome;
    private int idade;
    private String vila;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    Shinobi(){
    }

    public Shinobi(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public void andar(){

    }
    public void comer(){

    }

    public void falar(){

    }

    public void fazerMissaoes(){

    }

    public void fazerJutsu(){

    }
    public void ativarSharingan(){

    }
}
