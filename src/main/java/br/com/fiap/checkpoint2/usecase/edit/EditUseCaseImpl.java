package br.com.fiap.checkpoint2.usecase.edit;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;
import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditUseCaseImpl implements EditUseCase{

    @Autowired
    private PedidoRepository pedidoRepository;


    @Override
    public PedidoResponseDTO execute(PedidoRequestDTO pedidoRequestDTO, Long id) {
        Pedido pedidoAlterado = edit(pedidoRequestDTO, id);
        return new PedidoResponseDTO(pedidoAlterado);
    }

    public Pedido edit(PedidoRequestDTO pedidoRequestDTO, Long id) {
        Pedido pedidoAlterado = pedidoRepository.findById(id).get();
        pedidoAlterado.setDataPedido(pedidoRequestDTO.getDataPedido());
        pedidoAlterado.setCodigoCliente(pedidoRequestDTO.getCodigoCliente());
        pedidoAlterado.setDataCadastro(pedidoRequestDTO.getDataCadastro());
        pedidoAlterado.setValorTotal(pedidoRequestDTO.getValorTotal());
        pedidoRepository.save(pedidoAlterado);
        return pedidoAlterado;
    }
}
