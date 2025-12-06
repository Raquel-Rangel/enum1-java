package application;

import entities.enums.Ordem;
import entities.enums.StatusPedido;

import java.util.Date;

public class Program {

    public static void main(String[] args){

        Ordem ordem = new Ordem(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);

        System.out.println(ordem);

        StatusPedido os1 = StatusPedido.ENTREGUE;

        StatusPedido os2 = StatusPedido.valueOf("ENTREGADO");

        System.out.println(os1);
        System.out.println(os2);

    }
}
