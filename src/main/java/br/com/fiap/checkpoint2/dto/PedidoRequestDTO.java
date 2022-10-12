package br.com.fiap.checkpoint2.dto;

import br.com.fiap.checkpoint2.model.Pedido;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Instant;

@Data
public class PedidoRequestDTO {

    @NotNull
    private Instant dataPedido;

    @NotNull
    private Long codigoCliente;

    @NotNull
    private Instant dataCadastro;

    @NotNull
    private BigDecimal valorTotal;

    public Pedido convert() {
        return new Pedido()
                .builder()
                .dataPedido(dataPedido)
                .codigoCliente(codigoCliente)
                .dataCadastro(dataCadastro)
                .valorTotal(valorTotal)
                .build();
    }
}
