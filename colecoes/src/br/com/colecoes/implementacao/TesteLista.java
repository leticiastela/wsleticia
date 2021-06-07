package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Engenheiro");
		lista.add("DEV");
		lista.add("DBA");
		System.out.println(lista.get(0));
		lista.remove(1);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		for (int posicao=0;posicao<lista.size();posicao++) {
			System.out.println("Cargo:" +lista.get(posicao));
		}
		
		
	}
}
