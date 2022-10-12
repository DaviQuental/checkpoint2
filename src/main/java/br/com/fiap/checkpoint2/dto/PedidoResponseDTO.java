package br.com.fiap.checkpoint2.dto;

import br.com.fiap.checkpoint2.model.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoResponseDTO {

    private Long id;
    private Instant dataPedido;

    private Long codigoCliente;

    private Instant dataCadastro;

    private BigDecimal valorTotal;

    public PedidoResponseDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.dataPedido = pedido.getDataPedido();
        this.codigoCliente = pedido.getCodigoCliente();
        this.dataCadastro = pedido.getDataCadastro();
        this.valorTotal = pedido.getValorTotal();
    }
}