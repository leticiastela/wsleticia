package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {
	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 4000));
		lista.add(new Cargo("DEV", "PL", 10000));
		lista.add(new Cargo("ESTAG", "PL", 2500));
		lista.add(new Cargo("ANALISTA", "SR", 12000));
		System.out.println(lista);
		for(Cargo obj:lista) {
			System.out.println("Nome:" + obj.getNome());
			System.out.println("Nível:" + obj.getNivel());
			System.out.println("Salário:" + obj.getSalario());
		}
	}
}
