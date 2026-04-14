//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
Pedido pedido = new Pedido(StatusPedido.PROCESSANDO, "pedro", 1);
    pedido.avancarStatus(pedido);
    IO.println(pedido.getStatus());
    pedido.cancelarPedido();
}
