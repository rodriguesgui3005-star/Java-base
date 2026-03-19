public class Mago extends Personagem {

    public Mago(String nome, int vida, int  ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Mago(){

    }

    public int lancarMagia(){
        return super.atacar() + 15;
    }

    public int atacar(){
        return  super.atacar() * 3;
    }

    public int defender(){
        return super.defender() / 2;
    }
}
