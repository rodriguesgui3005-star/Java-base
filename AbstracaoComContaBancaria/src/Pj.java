public class Pj extends Conta{

    public Pj(String numero, String agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    public Pj() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 20);
        IO.println("saldo apos a tarifa é:  " + exibirSaldo());

    }


    @Override
    public void sacar(double valor) {
        IO.println("Seu saldo atual é: " + exibirSaldo());
        IO.println("Voce teve uma taxa adicional no valor de: R$1.50 e R$20 de Tarifa");
        super.sacar(valor + 1.50);
        calcularTarifaMensal();

    }
}
