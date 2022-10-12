package br.com.fiap.checkpoint2.usecase.delete;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUseCaseImpl implements DeleteUseCase {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public void execute(Long id) {
        pedidoRepository.deleteById(id);
    }
}
