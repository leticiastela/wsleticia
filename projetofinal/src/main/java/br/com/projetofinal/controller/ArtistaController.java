package br.com.projetofinal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.ArtistaDAO;
import br.com.projetofinal.modelo.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> addArtista(@RequestBody Artista objArtista){
		try {
			dao.save(objArtista);
			return ResponseEntity.ok(objArtista);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	@PostMapping("/deleteartista")
	public ResponseEntity<Boolean> deleteId(@RequestBody Artista objArtista) {
		try {
			dao.deleteById(objArtista.getId());
			return ResponseEntity.ok(true);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
		
	} 
	
	@PostMapping("/nacionalidade2")
	public ResponseEntity<List<Artista>> getArtistaNacionalidade2(@RequestBody Artista objeto){
		List<Artista> lista = (List<Artista>) dao.findAll();
		
		List<Artista> resposta = new ArrayList<Artista>();
		
		for (Artista obj : lista) {
			if (obj.getNacionalidade().equals(objeto.getNacionalidade())) {
				resposta.add(obj);
			}
		}
		
		if (resposta.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
		
	}
	@PostMapping("/artistanacionalidade")
	public ResponseEntity<List<Artista>> getArtistaNacionalidade(@RequestBody Artista objArtista){
		List<Artista> resposta = (List<Artista>) dao.findByNacionalidade(objArtista.getNacionalidade());
		if (resposta.size() == 0) {
			return ResponseEntity.status(403).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
	}
	
	@PostMapping("/artista")
	public ResponseEntity<Artista> getId(@RequestBody Artista objArtista){
		Artista retorno = dao.findById(objArtista.getId()).orElse(null);
		if(retorno == null)
		{
			return ResponseEntity.status(404).build();
		}
		else
		{
			return ResponseEntity.ok(retorno);
		}
	}
	
	@GetMapping("/artistas") //define rota
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();
		if(lista.size()==0)
		{
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);		
	}
	
	
}
