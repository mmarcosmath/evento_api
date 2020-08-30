package com.marcosdev.eventoapi.service;

import com.marcosdev.eventoapi.datasource.model.Evento;
import com.marcosdev.eventoapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CadastroEvento {
    @Autowired
    private EventoRepository eventoRepository;

    public void cadastrar(Evento evento){
        eventoRepository.saveAndFlush(evento);
    }

}
