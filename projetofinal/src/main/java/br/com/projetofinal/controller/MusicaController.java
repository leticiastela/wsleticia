package br.com.projetofinal.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.MusicaDAO;
import br.com.projetofinal.modelo.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;

	@GetMapping("/intervalo/{inicio}/{fim}")
	public ResponseEntity<List<Musica>>getIntervalo(@PathVariable String inicio, @PathVariable String fim){
		try 
		{
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			Date ini = formato.parse(inicio);
			Date termino = formato.parse(fim);
			List<Musica> lista = dao.findByCadastroBetween(ini,  termino);
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


	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getAll(){
		List<Musica> lista = (List<Musica>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	@PostMapping("/novamusica")
	public ResponseEntity<Musica> addMusica(@RequestBody Musica objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}		
	}










}