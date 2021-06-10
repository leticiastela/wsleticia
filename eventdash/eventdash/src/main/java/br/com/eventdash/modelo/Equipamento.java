package br.com.eventdash.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="itmn_equipamento")
public class Equipamento {
	
	public Equipamento() {
		super();
	}
	public Equipamento(int id, String hostname, String ip) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ipaddr = ip;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="hostname", length=50)
	private String hostname;
	
	@Column(name="ipaddr", length=15)
	private String ipaddr;
	
	@JsonIgnoreProperties("equipamento")
	@OneToMany(cascade=CascadeType.ALL, mappedBy="equipamento")
	private List<Evento> eventos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getIp() {
		return ipaddr;
	}
	public void setIp(String ip) {
		this.ipaddr = ip;
	}
	
	

}
