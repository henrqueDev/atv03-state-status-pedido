package status;

import pedido.Item;
import pedido.Pedido;

import java.util.List;
import java.util.Scanner;

public class TransportadoStatus extends Status{

    TransportadoStatus(Pedido pedido){
        super(pedido);
    }

    @Override
    public String onPreparacao() {
        return "O pedido já chegou  ao centro de distribuição e está a caminho do destinatário";
    }

    @Override
    public String onTransporte() {
        return "Pedido está a caminho para ser entregue ao destinatário";
    }

    @Override
    public String onRecebido() {
        List<Item> itemsPedido = this.pedido.getItems().stream().toList();
        for(Item item: itemsPedido) {
            Scanner sc = new Scanner(System.in);

            System.out.print("O item "+ item + " está nos conformes? (s/n)");
            String option = sc.nextLine();
            Boolean confirm = option.toLowerCase().equals("s") ? true : false;
            if(confirm) {
                this.pedido.getItems().remove(item);
                System.out.println("Item de id " + item.getId() + " confirmado!" );
            }else{
                System.out.println("Item de id " + item.getId() + " rejeitado!" );
            }
            this.pedido.setconfirmacaoEntrega(confirm);
        }
        this.pedido.setStatus(new RecebidoStatus(this.pedido));
        return "Pedido entregue ao destinatário";
    }

    @Override
    public String onFinalizado() {
        return "Pedido não finalizado";
    }
}
