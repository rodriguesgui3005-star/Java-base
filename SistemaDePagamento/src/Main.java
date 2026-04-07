//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    IO.println("============");
    IO.println("Metodo Boleto Bancario: ");
    Pagamento boleto = new BB();
    boleto.processaarPagamento();


    IO.println("============");
    IO.println("Metodo Cartao de credito: ");
    Pagamento CartaoDeCredito = new Cc();
    CartaoDeCredito.processaarPagamento();

    IO.println("============");
    IO.println("Metodo pix: ");
    Pagamento Pix = new Pix();
    Pix.processaarPagamento();
}
