package org.example.wallace;

abstract class ManipuladorPedidoBase implements ManipuladorPedido {
    private ManipuladorPedido proximo;

    public ManipuladorPedidoBase(ManipuladorPedido proximo) {
        this.proximo = proximo;
    }

    protected void chamarProximo(Pedido pedido) {
        if (proximo != null) {
            proximo.manipularPedido(pedido);
        }
    }
}
