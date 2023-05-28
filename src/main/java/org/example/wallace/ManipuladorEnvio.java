package org.example.wallace;

public class ManipuladorEnvio extends ManipuladorPedidoBase {
    public ManipuladorEnvio(ManipuladorPedido proximo) {
        super(proximo);
    }

    @Override
    public void manipularPedido(Pedido pedido) {
        // Lógica de envio do pedido
    }
}
