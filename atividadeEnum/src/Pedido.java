import java.io.ObjectInputFilter;

public class Pedido {

    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido() {
    }

    public Pedido(StatusPedido status, String cliente, int id) {
        this.status = status;
        this.cliente = cliente;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void avancarStatus(Pedido pedido){
        IO.println("Status do  pedido");
        if (StatusPedido.AGUARDANDO_PAGAMENTO == pedido.getStatus()){
            setStatus(StatusPedido.PROCESSANDO);
        } else if (StatusPedido.PROCESSANDO == pedido.getStatus()) {
            setStatus(StatusPedido.ENVIADO);
        } else if (StatusPedido.ENVIADO == pedido.getStatus()) {
            setStatus(StatusPedido.ENTREGUE);
        } else {
            IO.println("Nao pode ser alterado");
        }

    }

    public void cancelarPedido(){
        if (status != StatusPedido.ENTREGUE){
            IO.println("Pedido cancelado com sucesso!!");
        } else {
            IO.println("o pedido foi nao é possivel cancelar");
        }
    }
}