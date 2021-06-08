package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);
		
	
	
	

}
