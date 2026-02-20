package exercicio2;

public class carro {

    public String cor;
    private String modelo;
    private double velocida;

    public void ronco() {
        IO.println("vrummmmmm");
    }

    public carro(String cor, String modelo, double velocida) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocida = velocida;
    }

    @Override
    public String toString() {
        return "carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocida=" + velocida +
                '}';
    }
}
