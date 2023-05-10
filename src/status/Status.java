package status;

import pedido.Pedido;

// Status interface
public abstract class Status {
    public Pedido pedido;

    public Status(Pedido pedido){
        this.pedido = pedido;
    }

    public abstract String onPreparacao();
    public abstract String onTransporte();
    public abstract String onRecebido();
    public abstract String onFinalizado();
}
