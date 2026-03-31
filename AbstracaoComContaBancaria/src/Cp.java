public class Cp extends Conta{

    public Cp(String numero, String agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    public Cp() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo());
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        calcularTarifaMensal();
    }
}
