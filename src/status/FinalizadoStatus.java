package status;

import pedido.Pedido;

public class FinalizadoStatus extends Status{

    FinalizadoStatus(Pedido pedido){
        super(pedido);
    }

    @Override
    public String onPreparacao() {
        return "Pedido finalizado";
    }

    @Override
    public String onTransporte() {
        return "Pedido finalizadoo";
    }

    @Override
    public String onRecebido() {
        return "Pedido finalizado";

    }

    @Override
    public String onFinalizado() {
        return "Pedido finalizado";
    }
}
