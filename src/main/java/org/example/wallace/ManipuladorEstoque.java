package org.example.wallace;

public class ManipuladorEstoque extends ManipuladorPedidoBase {
    public ManipuladorEstoque(ManipuladorPedido proximo) {
        super(proximo);
    }

    @Override
    public void manipularPedido(Pedido pedido) {
        boolean estoqueDisponivel = true;
        if (estoqueDisponivel) {
            chamarProximo(pedido);
        } else {
            // Lógica de cancelamento do pedido
        }
    }
}
