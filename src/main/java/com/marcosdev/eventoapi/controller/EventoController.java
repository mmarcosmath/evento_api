package com.marcosdev.eventoapi.controller;

import com.marcosdev.eventoapi.datasource.model.Evento;
import com.marcosdev.eventoapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping(path = "api/evento-id/{}")
    public ResponseEntity<Optional<Evento>> buscarEventoPorId(@PathVariable(name = "id",required = true) Long idEvento){
        return ResponseEntity
                .ok(eventoRepository.findById(idEvento));
    }
}
