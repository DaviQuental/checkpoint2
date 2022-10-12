package br.com.fiap.checkpoint2.usecase.list;

import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;

import java.util.List;

public interface ListUseCase {
    List<PedidoResponseDTO> execute();
}
