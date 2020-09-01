package com.marcosdev.eventoapi.service;

import com.marcosdev.eventoapi.datasource.model.Evento;
import com.marcosdev.eventoapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarEventosService {

    @Autowired
    private EventoRepository eventoRepository;


    public List<Evento> listarEventos(){
        return eventoRepository.findAll();
    }

}
