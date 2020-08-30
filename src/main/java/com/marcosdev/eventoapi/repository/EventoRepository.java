package com.marcosdev.eventoapi.repository;

import com.marcosdev.eventoapi.datasource.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository
        extends JpaRepository<Evento,Long> {


}
