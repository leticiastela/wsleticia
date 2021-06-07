package br.com.unixyz.modelo;

public class Graduacao extends Curso {
	
	public Graduacao(String nome, String titulacao, double valor, int cargaHoraria, String projetoConclusao,
			int cargaHorarioEstagio) {
		super(nome, titulacao, valor, cargaHoraria);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}
	
	public Graduacao() {
		super();
	}

	private String projetoConclusao;
	private int cargaHorarioEstagio;
	
	public String toString() {
		return "Graduacao [projetoConclusao=" + projetoConclusao + ", cargaHorarioEstagio=" + cargaHorarioEstagio
				+ ", toString()=" + super.toString() + "]";
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorarioEstagio() {
		return cargaHorarioEstagio;
	}

	public void setCargaHorarioEstagio(int cargaHorarioEstagio) {
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}
	
	


	
	
	

}
