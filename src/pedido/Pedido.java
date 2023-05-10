package pedido;

import status.PreparacaoStatus;
import status.Status;

import java.util.ArrayList;
import java.util.List;

//  Context
public class Pedido {
    private List<Item> items;

    private List<Item> itemsConfirmados;

    private Boolean confirmacaoEntrega;

    private Status status;


    public Pedido(List<Item> items) {
        this.items = items;
        this.confirmacaoEntrega= false;
        this.status = new PreparacaoStatus(this);
        this.itemsConfirmados = new ArrayList<Item>();
    }


    public List<Item> getItems() {
        return items;
    }

    public List<Item> getItemsConfirmados() {
        return itemsConfirmados;
    }



    public Boolean getconfirmacaoEntrega() {
        return confirmacaoEntrega;
    }

    public void setconfirmacaoEntrega(Boolean entregue) {
        this.confirmacaoEntrega = entregue;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
