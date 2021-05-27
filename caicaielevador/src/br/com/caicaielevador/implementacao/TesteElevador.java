package br.com.caicaielevador.implementacao;

import br.com.caicaielevador.modelo.Elevador;

public class TesteElevador {
	public static void main(String[] args) {
		Elevador objElevador = new Elevador();
		objElevador.preencherNome("Elevador Clínica");
		objElevador.inicializar(10, 0, 15);
		
		System.out.println(objElevador.retornarNome());
		System.out.println(objElevador.retornarResumo());
		
		objElevador.subir();
		objElevador.entrar(5);
		objElevador.descer();
		objElevador.sair();
		
		System.out.println(objElevador.retornarResumo());
	}
}
