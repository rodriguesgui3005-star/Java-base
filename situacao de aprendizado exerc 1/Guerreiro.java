public class Guerreiro extends Personagem {

    public Guerreiro() {
    }

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void golpePesado(){

    }

    public void defesa(int defesa){
        defesa = defesa * 3;
    }

    public void ataque(int ataque){
        ataque = ataque * 2;
    }

    public int defender(){
        return super.defender() / 2;
    }
}
