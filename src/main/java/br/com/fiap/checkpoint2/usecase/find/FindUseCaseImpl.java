package br.com.fiap.checkpoint2.usecase.find;

import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindUseCaseImpl implements FindUseCase {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public PedidoResponseDTO execute(Long id) {
        if(pedidoRepository.existsById(id)) {
            return new PedidoResponseDTO(pedidoRepository.findById(id).get());
        }
        return null;
    }
}
