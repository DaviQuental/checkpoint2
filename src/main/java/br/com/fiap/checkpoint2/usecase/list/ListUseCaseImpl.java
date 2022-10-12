package br.com.fiap.checkpoint2.usecase.list;

import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;
import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListUseCaseImpl implements ListUseCase {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public List<PedidoResponseDTO> execute() {
        List<Pedido> listPedido = pedidoRepository.findAll();
        return listPedido.stream().map(pedido -> new PedidoResponseDTO(pedido)).collect(Collectors.toList());
    }
}
