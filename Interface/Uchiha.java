package Interface;

public class Uchiha extends Shinobi implements KekkeiGenkai{
    private String cla;

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String vila) {
        super(nome, idade, vila);
    }

    public void ativarJustuOcular(){
        IO.println("sharingan");
    }
}

