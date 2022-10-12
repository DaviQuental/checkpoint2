package br.com.fiap.checkpoint2.usecase.edit;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;

public interface EditUseCase {
    PedidoResponseDTO execute(PedidoRequestDTO pedidoRequestDTO, Long id);
}
