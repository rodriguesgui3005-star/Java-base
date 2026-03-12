public class Farmaceutico extends Funcionario{
    private String crf;

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public Farmaceutico(){

    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.15 );
    }
}
