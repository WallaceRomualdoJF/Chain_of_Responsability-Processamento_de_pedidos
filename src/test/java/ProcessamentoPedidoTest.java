import org.example.wallace.*;
import org.junit.Assert;
import org.junit.Test;

public class ProcessamentoPedidoTest {

    @Test
    public void testProcessamentoPedido() {
        ManipuladorPedido manipuladorEstoque = new ManipuladorEstoque(null);
        ManipuladorPedido manipuladorPagamento = new ManipuladorPagamento(manipuladorEstoque);
        ManipuladorPedido manipuladorEnvio = new ManipuladorEnvio(manipuladorPagamento);

        Pedido pedido1 = new Pedido(100.0);
        Pedido pedido2 = new Pedido(200.0);
        Pedido pedido3 = new Pedido(300.0);

        manipuladorEnvio.manipularPedido(pedido1);
        manipuladorEnvio.manipularPedido(pedido2);
        manipuladorEnvio.manipularPedido(pedido3);

        // Verificar se os pedidos foram processados corretamente
        Assert.assertTrue(pedido1.getValor() == 100.0); // Pedido 1 foi processado
        Assert.assertTrue(pedido2.getValor() == 200.0); // Pedido 2 foi processado
        Assert.assertTrue(pedido3.getValor() == 300.0); // Pedido 3 foi processado
    }
}