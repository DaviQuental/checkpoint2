package br.com.fiap.checkpoint2.usecase.create;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;
import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUseCaseImpl implements CreateUseCase{

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public PedidoResponseDTO execute(PedidoRequestDTO pedidoRequestDTO) {
        Pedido pedido = pedidoRequestDTO.convert();
        pedidoRepository.save(pedido);
        return new PedidoResponseDTO(pedido);
    }
}
