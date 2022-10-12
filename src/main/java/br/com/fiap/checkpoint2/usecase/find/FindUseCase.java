package br.com.fiap.checkpoint2.usecase.find;

import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;

public interface FindUseCase {
    PedidoResponseDTO execute(Long id);
}
