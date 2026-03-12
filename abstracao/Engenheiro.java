public class Engenheiro extends Funcionario{
    private String numCrea;

    public String getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(String numCrea) {
        this.numCrea = numCrea;
    }

    public Engenheiro(){

    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.27 );
    }
}
