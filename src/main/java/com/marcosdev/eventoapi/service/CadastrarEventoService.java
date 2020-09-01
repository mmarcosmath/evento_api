package com.marcosdev.eventoapi.service;

import com.marcosdev.eventoapi.datasource.model.Evento;
import com.marcosdev.eventoapi.repository.EventoRepository;
import com.marcosdev.eventoapi.resource.model.EventoResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CadastrarEventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public void cadastrarEvento(EventoResource eventoResource){

        eventoRepository.saveAndFlush(eventoResource.eventoResourceConversor());
    }

}
