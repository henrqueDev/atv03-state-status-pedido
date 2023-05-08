package status;

import pedido.Pedido;

public class PreparacaoStatus implements Status{
    Pedido pedido;

    PreparacaoStatus(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public String onPreparacao() {
        return "O pedido está sendo sendo separado no centro de distribuição para envio à\n" +
                "transportadora.";
    }

    @Override
    public String onTransporte() {
        return "Aguardando o pedido ser entregue a transportadora";
    }

    @Override
    public String onRecebido() {
        return "Aguardando o pedido ser recebido pelo destinatário";
    }

    @Override
    public String onFinalizado() {
        return "Pedido não finalizado";
    }
}
