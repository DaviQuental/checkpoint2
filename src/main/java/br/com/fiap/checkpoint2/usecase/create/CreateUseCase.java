package br.com.fiap.checkpoint2.usecase.create;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;

public interface CreateUseCase {
    PedidoResponseDTO execute(PedidoRequestDTO pedidoRequestDTO);
}
