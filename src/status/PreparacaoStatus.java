package status;

import pedido.Pedido;

public class PreparacaoStatus extends Status{

    public PreparacaoStatus(Pedido pedido){
        super(pedido);
    }

    @Override
    public String onPreparacao() {
        this.pedido.setStatus(new PreparacaoStatus(this.pedido));
        return "O pedido está sendo separado para ser entregue a\n" +
                "transportadora.";
    }

    @Override
    public String onTransporte() {
        this.pedido.setStatus(new TransportandoStatus(this.pedido));
        return "O pedido foi ao centro de distribuição";
    }

    @Override
    public String onRecebido() {
        return "Aguardando chegar ao centro de distribuição";
    }

    @Override
    public String onFinalizado() {
        return "Pedido não finalizado";
    }
}
