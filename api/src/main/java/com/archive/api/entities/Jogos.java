package com.archive.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "jogos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jogos {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private String desenvolvedora;
    private String genero;
    private Date lancamento;
    private String img;
}