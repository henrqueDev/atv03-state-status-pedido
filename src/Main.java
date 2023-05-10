
import pedido.Item;
import pedido.Pedido;
import status.FinalizadoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Item 1", 1000.00));
        itens.add(new Item(2, "Item 2", 2000.00));
        Pedido pedido = new Pedido(itens);
        while(pedido.getStatus().getClass() != FinalizadoStatus.class){

            System.out.println("\nOPCAO 1 -> Preparacao");
            System.out.println("OPCAO 2 -> Colocar para transporte");
            System.out.println("OPCAO 3 -> Receber pedido");
            System.out.println("OPCAO 4 -> Finalizar pedido");

            Scanner scs= new Scanner(System.in);
            String sc= scs.nextLine();
            if(sc.equals("1")){
                System.out.print(pedido.getStatus().onPreparacao());
            } else if (sc.equals("2")) {
                System.out.print(pedido.getStatus().onTransporte());
            }else if (sc.equals("3")) {
                System.out.print(pedido.getStatus().onRecebido());
            } else if (sc.equals("4")) {
                System.out.print(pedido.getStatus().onFinalizado());
            } else {
                System.out.print("Opção invalida! Digite novamente!");
            }
        }


    }
}