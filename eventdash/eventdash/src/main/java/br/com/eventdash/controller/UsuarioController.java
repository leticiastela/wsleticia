package br.com.eventdash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eventdash.dao.UsuarioDAO;
import br.com.eventdash.modelo.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	@Autowired //gerencia DAO
	private UsuarioDAO dao;
	
	@PostMapping("/loginemail")
	public ResponseEntity<Usuario> loginEmail(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta == null) {
			return ResponseEntity.status(403).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
	}
	
	@PostMapping("/loginracf")
	public ResponseEntity<Usuario> loginRacf(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByRacfAndSenha(objeto.getRacf(), objeto.getSenha());
		if (resposta == null) {
			return ResponseEntity.status(403).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
	}	
	
	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> addUser(@RequestBody Usuario objUsuario){
		try {
			dao.save(objUsuario);
			return ResponseEntity.ok(objUsuario);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> getUserId(@RequestBody Usuario objUsuario){
		Usuario retorno = dao.findById(objUsuario.getId()).orElse(null);
		if(retorno == null)
		{
			return ResponseEntity.status(404).build();
		}
		else
		{
			return ResponseEntity.ok(retorno);
		}
	}
	
	@GetMapping("/usuarios") //define rota
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		if(lista.size()==0)
		{
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);		
	}

}
