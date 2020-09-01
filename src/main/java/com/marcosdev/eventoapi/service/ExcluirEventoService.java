package com.marcosdev.eventoapi.service;

import com.marcosdev.eventoapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcluirEventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public void excluirEvento(Long id){
        eventoRepository.deleteById(id);
    }
}
