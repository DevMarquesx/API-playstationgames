package com.archive.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "jogos")
@Data

public class Jogos {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private String desenvolvedora;
    private String genero;
    private Date lancamento;
    private String img;

    public Jogos(String id, String nome, String descricao, String desenvolvedora, String genero, Date lancamento, String img) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.desenvolvedora = desenvolvedora;
        this.genero = genero;
        this.lancamento = lancamento;
        this.img = img;
    }

    public Jogos() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}