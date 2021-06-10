package br.com.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.eventdash.modelo.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme,Integer> {

}
