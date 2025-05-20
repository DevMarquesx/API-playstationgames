package com.archive.api.controllers;

import com.archive.api.entities.Jogos;
import com.archive.api.services.JogosService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    private final JogosService service;

    public JogosController(JogosService service) {
        this.service = service;
    }

    // 🔍 Buscar todos
    @GetMapping
    public Iterable<Jogos> buscarJogos() {
        return service.buscarTodos();
    }

    // ➕ Inserir novo
    @PostMapping
    public Jogos inserir(@RequestBody Jogos jogos) {
        return service.salvar(jogos);
    }

    // 🔄 Atualizar
    @PutMapping("/{id}")
    public Jogos atualizarJogo(@PathVariable String id, @RequestBody Jogos jogos) {
        jogos.setId(id);
        return service.salvar(jogos);
    }

    // ❌ Deletar
    @DeleteMapping("/{id}")
    public void deletarGame(@PathVariable String id) {
        service.deletar(id);
    }
}
