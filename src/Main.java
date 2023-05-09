import cliente.Cliente;
import pedido.Item;
import pedido.Pedido;
import status.FinalizadoStatus;
import status.PreparacaoStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Item 1", 1000.00));
        itens.add(new Item(2, "Item 2", 2000.00));
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido(itens);
        cliente.setPedido(pedido);
        while(cliente.getPedido().getStatus().getClass() != FinalizadoStatus.class){

            Scanner scs= new Scanner(System.in);
            String sc= scs.nextLine();
            if(sc.equals("1")){
                System.out.print("OPCAO 1 ");

                System.out.print(cliente.getPedido().getStatus().onPreparacao());
            } else if (sc.equals("2")) {
                System.out.print(cliente.getPedido().getStatus().onTransporte());
            }else if (sc.equals("3")) {
                System.out.print(cliente.getPedido().getStatus().onRecebido());
            } else {
                System.out.print(cliente.getPedido().getStatus().onFinalizado());
            }
        }


    }
}