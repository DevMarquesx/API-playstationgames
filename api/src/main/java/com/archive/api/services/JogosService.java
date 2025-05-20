package com.archive.api.services;
import com.archive.api.entities.Jogos;
import com.archive.api.repositoryes.JogosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogosService {

    private final JogosRepository repository;

    public JogosService(JogosRepository repository) {
        this.repository = repository;
    }


    public List<Jogos> buscarTodos() {
        return repository.findAll();
    }



    public Jogos salvar(Jogos jogos) {
        if (jogos.getNome() == null || jogos.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do jogo não pode ser vazio");
        }
        return repository.save(jogos);
    }

    public Jogos atualizar(String id, Jogos jogos) {
        jogos.setId(id);
        return repository.save(jogos);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }

}
