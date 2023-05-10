package status;

import pedido.Pedido;

public class RecebidoStatus extends Status{

    RecebidoStatus(Pedido pedido){
        super(pedido);
    }

    @Override
    public String onPreparacao() {
        if(this.pedido.getconfirmacaoEntrega() == false){
            this.pedido.setStatus(new PreparacaoStatus(this.pedido));
            return "Pedido não foi aceito pelo destinatário! Devolvendo para a loja para devolução do pedido";
        }
        return "Peidod chegou no destinatário e foi confirmado! Aguardando cliente finalizar o pedido";
    }

    @Override
    public String onTransporte() {
        return "Pedido saiu do centro de distribuição e chegou ao destinatário!";
    }

    @Override
    public String onRecebido() {
        return "Pedido recebido pelo destinatário!";
    }

    @Override
    public String onFinalizado() {
        if(this.pedido.getconfirmacaoEntrega() == false){
            this.pedido.setStatus(new PreparacaoStatus(this.pedido));
            return "Pedido não foi aceito pelo destinatário! Devolvendo para a loja para devolução do pedido";
        }
        System.out.println("Os items " + this.pedido.getItemsConfirmados() + " Foram confirmados");
        this.pedido.setStatus(new FinalizadoStatus(this.pedido));
        return "Pedido finalizado";
    }
}
