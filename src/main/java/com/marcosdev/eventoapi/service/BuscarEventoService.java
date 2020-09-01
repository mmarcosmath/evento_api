package com.marcosdev.eventoapi.service;


import com.marcosdev.eventoapi.datasource.model.Evento;
import com.marcosdev.eventoapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarEventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public Optional<Evento> buscarEvetoPorId(Long id){
        return eventoRepository.findById(id);
    }



}
