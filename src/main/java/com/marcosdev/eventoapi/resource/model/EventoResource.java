package com.marcosdev.eventoapi.resource.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventoResource {


    private Long id;
    private String nome;
    private String local;
    @JsonProperty("id_responsavel")
    private Long idResponsavel;


    public EventoResource(String nome, String local, Long idResponsavel) {
        this.nome = nome;
        this.local = local;
        this.idResponsavel = idResponsavel;
    }

    @SuppressWarnings("unsed")
    public EventoResource( ) {
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
