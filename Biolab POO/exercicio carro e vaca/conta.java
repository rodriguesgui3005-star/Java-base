package exercicio2;

public class conta {

    public double saldo;
    public int nConta;
    public int agencia;

    public void sacar(double saque) {
        if(saldo >= saque) {
            saldo = saldo - saque;
            IO.println("Saque realizado com sucesso \n seu saldo atual é " + saldo);
        } else {
            IO.println("saldo insuficiente");
        }
    }

    public String depositar(double deposito) {
        saldo = saldo + deposito;
        return "Seu novo saldo é: " + saldo;
    }

    @Override
    public String toString() {
        return "conta{" +
                "saldo=" + saldo +
                ", nConta=" + nConta +
                ", agencia=" + agencia +
                '}';
    }
}
