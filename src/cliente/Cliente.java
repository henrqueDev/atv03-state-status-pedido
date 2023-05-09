package cliente;

import pedido.Item;
import pedido.Pedido;

import java.util.List;

public class Cliente {
    private Pedido pedido;

    public Cliente(){}


    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
