package pedido;

import java.util.ArrayList;
import java.util.List;

//  Context
public class Pedido {
    List<Item> items;
    public Pedido() {
        this.items = new ArrayList<>();
    }
    public Pedido(List<Item> items) {
        this.items = items;
    }



}
