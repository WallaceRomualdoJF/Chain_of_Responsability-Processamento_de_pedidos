package org.example.wallace;

public class ManipuladorPagamento extends ManipuladorPedidoBase {
    public ManipuladorPagamento(ManipuladorPedido proximo) {
        super(proximo);
    }

    @Override
    public void manipularPedido(Pedido pedido) {
        boolean pagamentoValido = true;
        if (pagamentoValido) {
            chamarProximo(pedido);
        } else {
            // Lógica de cancelamento do pedido
        }
    }
}
