public class Personagem {

    private String nome;
    private int vida = 100;
    private int ataque = 10;
    private int defesa = 5;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa =  defesa;
    }

    public Personagem() {

    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void receberDano(int dano){
        vida = vida - dano;
        IO.println("A vida atual é: " + vida );
    }

    public void mostrarStatus(){
        IO.println("sua vida atual é: " + vida + " Sua defesa é: " + defesa + " Seu ataque é: " + ataque);
    }

    public int atacar(){
        return ataque;
    }

    public int defender(){
        return defesa;
    }
}
