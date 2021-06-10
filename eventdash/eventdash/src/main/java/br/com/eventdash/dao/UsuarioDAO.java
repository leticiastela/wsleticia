package br.com.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.eventdash.modelo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfAndSenha(String racf, String senha);
}
