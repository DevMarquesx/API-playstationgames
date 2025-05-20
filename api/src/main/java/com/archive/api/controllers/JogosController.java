package com.archive.api.controllers;

import com.archive.api.entities.Jogos;
import com.archive.api.services.JogosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")

public class JogosController {

    private final JogosService service;

    public JogosController(JogosService service) {
        this.service = service;
    }

    @Operation(summary = "Buscar todos os jogos", description = "Retorna a lista completa de jogos disponíveis no sistema.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista encontrada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    @GetMapping
    public Iterable<Jogos> buscarJogos() {
        return service.buscarTodos();
    }

    @Operation(summary = "Adicionar um novo jogo", description = "Insere um novo jogo no banco de dados.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Jogo inserido com sucesso"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos enviados")
    })
    @PostMapping
    public Jogos inserir(@RequestBody Jogos jogos) {
        return service.salvar(jogos);
    }

    @Operation(summary = "Atualizar um jogo", description = "Atualiza os detalhes de um jogo com base no ID informado.")
    @PutMapping("/{id}")
    public Jogos atualizarJogo(@PathVariable String id, @RequestBody Jogos jogos) {
        jogos.setId(id);
        return service.salvar(jogos);
    }

    @Operation(summary = "Deletar um jogo", description = "Remove um jogo do banco de dados pelo ID.")
    @DeleteMapping("/{id}")
    public void deletarGame(@PathVariable String id) {
        service.deletar(id);
    }
}