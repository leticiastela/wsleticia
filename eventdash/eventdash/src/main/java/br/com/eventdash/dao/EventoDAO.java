package br.com.eventdash.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eventdash.modelo.Evento;

public interface EventoDAO extends CrudRepository<Evento,Integer> {
	List<Evento> findByDataEvtBetween(Date inicio, Date termino);
}
