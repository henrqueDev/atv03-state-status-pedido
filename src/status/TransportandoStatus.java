package status;

import pedido.Pedido;

import java.util.Scanner;

public class TransportandoStatus extends Status{

    TransportandoStatus(Pedido pedido){
        super(pedido);
    }

    @Override
    public String onPreparacao() {
        return "O pedido foi entregue ao centro de distribuição";
    }

    @Override
    public String onTransporte() {
        return "Pedido está a caminho para ser entregue ao destinatário";
    }

    @Override
    public String onRecebido() {
        Scanner sc= new Scanner(System.in);
        String option = sc.nextLine();
        System.out.println(option);
        Boolean confirm = option.equals("s") ? true :  false;
        this.pedido.setconfirmacaoEntrega(confirm);
        this.pedido.setStatus(new RecebidoStatus(this.pedido));
        return "Pedido entregue ao destinatário";
    }

    @Override
    public String onFinalizado() {
        return "Pedido não finalizado";
    }
}
