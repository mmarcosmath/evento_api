package com.marcosdev.eventoapi.datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "evento")
public class Evento {

    @Id
    private Long id;

    private String nome;
    private String local;

    @Column(name = "id_responsavel")
    private Long idResponsavel;


    public Evento(String nome, String local, Long idResponsavel) {
        this.nome = nome;
        this.local = local;
        this.idResponsavel = idResponsavel;
    }

    @SuppressWarnings("unsed")
    public Evento( ) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
}
