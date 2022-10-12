package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.dto.PedidoRequestDTO;
import br.com.fiap.checkpoint2.dto.PedidoResponseDTO;
import br.com.fiap.checkpoint2.usecase.create.CreateUseCaseImpl;
import br.com.fiap.checkpoint2.usecase.delete.DeleteUseCaseImpl;
import br.com.fiap.checkpoint2.usecase.edit.EditUseCaseImpl;
import br.com.fiap.checkpoint2.usecase.find.FindUseCaseImpl;
import br.com.fiap.checkpoint2.usecase.list.ListUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private CreateUseCaseImpl createUseCaseImpl;
    @Autowired
    private DeleteUseCaseImpl deleteUseCaseImpl;
    @Autowired
    private EditUseCaseImpl editUseCaseImpl;
    @Autowired
    private FindUseCaseImpl findUseCaseImpl;
    @Autowired
    private ListUseCaseImpl listUseCaseImpl;

    @GetMapping
    public ResponseEntity<List<PedidoResponseDTO>> listPedidos() {
        List<PedidoResponseDTO> listPedidosDTO = listUseCaseImpl.execute();
        return ResponseEntity.ok(listPedidosDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> findPedido(@PathVariable Long id) {
        PedidoResponseDTO pedidoDTO = findUseCaseImpl.execute(id);
        return ResponseEntity.ok(pedidoDTO);
    }

    @PostMapping
    public ResponseEntity<PedidoResponseDTO> createPedido(@RequestBody @Valid PedidoRequestDTO pedidoRequestDTO) {
        PedidoResponseDTO pedidoDTO = createUseCaseImpl.execute(pedidoRequestDTO);
        return new ResponseEntity<>(pedidoDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> updatePedido(@PathVariable Long id, @RequestBody @Valid PedidoRequestDTO pedidoRequestDTO) {
        PedidoResponseDTO pedidoDTO = editUseCaseImpl.execute(pedidoRequestDTO, id);
        return ResponseEntity.ok(pedidoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePedido(@PathVariable Long id) {
        deleteUseCaseImpl.execute(id);
        return ResponseEntity.noContent().build();
    }
}
