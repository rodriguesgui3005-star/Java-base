public class Arqueiro extends Personagem{

    public Arqueiro() {
        super();
    }

    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void disparoPreciso(){

    }

    public int atacar(){
        return  super.atacar() * 2;
    }

    public void defasa(int defesa){
        defesa = defesa * 2;
    }

}
