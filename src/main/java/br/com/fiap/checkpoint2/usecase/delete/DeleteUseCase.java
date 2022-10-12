package br.com.fiap.checkpoint2.usecase.delete;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;

public interface DeleteUseCase {
    void execute(Long id);
}
