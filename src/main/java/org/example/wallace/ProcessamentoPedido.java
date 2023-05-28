package org.example.wallace;

import java.util.ArrayList;
import java.util.List;

public class ProcessamentoPedido {
    public static void main(String[] args) {
        ManipuladorPedido manipuladorEstoque = new ManipuladorEstoque(null);
        ManipuladorPedido manipuladorPagamento = new ManipuladorPagamento(manipuladorEstoque);
        ManipuladorPedido manipuladorEnvio = new ManipuladorEnvio(manipuladorPagamento);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(100.0));
        pedidos.add(new Pedido(200.0));
        pedidos.add(new Pedido(300.0));

        for (Pedido pedido : pedidos) {
            manipuladorEnvio.manipularPedido(pedido);
        }
    }
}
