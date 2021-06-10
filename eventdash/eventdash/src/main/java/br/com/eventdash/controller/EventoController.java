package br.com.eventdash.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.eventdash.dao.EventoDAO;
import br.com.eventdash.modelo.Evento;

@RestController
@CrossOrigin("*")
public class EventoController {
	
	@Autowired
	private EventoDAO dao;

	@GetMapping("/periodo/{inicio}/{fim}")
	public ResponseEntity<List<Evento>>getIntervalo(@PathVariable String inicio, @PathVariable String fim){
		try 
		{
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			Date ini = formato.parse(inicio);
			Date termino = formato.parse(fim);
			List<Evento> lista = dao.findByDataEvtBetween(ini,  termino);
			if(lista.size()==0)
			{
				return ResponseEntity.status(404).build();
			}
			return ResponseEntity.ok(lista);
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}

	}
}
