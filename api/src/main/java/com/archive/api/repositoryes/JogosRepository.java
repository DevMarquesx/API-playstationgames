package com.archive.api.repositoryes;

import com.archive.api.entities.Jogos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface JogosRepository extends MongoRepository<Jogos, String> {
}
