package com.marcosdev.eventoapi.controller;

import com.marcosdev.eventoapi.datasource.model.Evento;
import com.marcosdev.eventoapi.repository.EventoRepository;
import com.marcosdev.eventoapi.resource.model.EventoResource;
import com.marcosdev.eventoapi.service.BuscarEventoService;
import com.marcosdev.eventoapi.service.CadastrarEventoService;
import com.marcosdev.eventoapi.service.ExcluirEventoService;
import com.marcosdev.eventoapi.service.ListarEventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/evento")
public class EventoController {

    @Autowired
    private BuscarEventoService buscarEventoService;

    @Autowired
    private ExcluirEventoService excluirEventoService;

    @Autowired
    private CadastrarEventoService cadastrarEventoService;

    @Autowired
    private ListarEventosService listarEventosService;

    @GetMapping(path = "/buscar-evento/{id}")
    public ResponseEntity<Optional<Evento>> buscarEventoPorId(@PathVariable(name = "id",required = true) Long idEvento){
        return ResponseEntity
                .ok(buscarEventoService.buscarEvetoPorId(idEvento));
    }

    @GetMapping(path = "/listar-evento")
    public ResponseEntity<List<Evento>> listarTodos(){
        return ResponseEntity.ok(listarEventosService
                .listarEventos());

    }

    @PostMapping(path = "/cadastrar-evento")
    public void criarEvento(@RequestBody EventoResource eventoResource){
        cadastrarEventoService.cadastrarEvento(eventoResource);

    }

    @DeleteMapping(path = "/excluir-evento/{id}")
    public void excluirEvento(
            @PathVariable(name = "id",required = true) Long id){
        excluirEventoService.excluirEvento(id);
    }


}
