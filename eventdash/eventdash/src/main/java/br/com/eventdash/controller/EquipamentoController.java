package br.com.eventdash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eventdash.dao.EquipamentoDAO;
import br.com.eventdash.modelo.Equipamento;

@RestController
@CrossOrigin("*")
public class EquipamentoController {
	@Autowired
	private EquipamentoDAO dao;
	
	
	
	@GetMapping("/equipamentos") //define rota
	public ResponseEntity<List<Equipamento>> getAll(){
		List<Equipamento> lista = (List<Equipamento>) dao.findAll();
		if(lista.size()==0)
		{
			return ResponseEntity.status(403).build();
		}
		return ResponseEntity.ok(lista);		
	}

}
