package br.com.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.eventdash.modelo.Equipamento;

public interface EquipamentoDAO extends CrudRepository<Equipamento,Integer> {
	
}
