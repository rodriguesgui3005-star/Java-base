public class Cc extends Conta{

    public Cc(String numero, String agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    public Cc() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 12);
        IO.println("Esse é seu saldo apos a tarifa " + exibirSaldo());
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        calcularTarifaMensal();
    }
}
