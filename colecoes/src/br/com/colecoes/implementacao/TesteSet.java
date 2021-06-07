package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("Estagiário");
		lista.add("Analista");
		lista.add("DEV");
		lista.add("DBA");
		System.out.println(lista);
		
		for(String cargo : lista) {
			System.out.println(cargo);
		}
	}
}
