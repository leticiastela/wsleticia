package br.com.projetofinal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ARTISTA")
public class Artista {
	
	public Artista() {
		super();
	}
	public Artista(int id, String nomeArtistico, String nacionalidade, String estilo) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.estilo = estilo;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nomeArtistico", length=50)
	private String nomeArtistico;
	
	@Column(name="nacionalidade", length=20)
	private String nacionalidade;
	
	@Column(name="estilo", length=50)
	private String estilo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
