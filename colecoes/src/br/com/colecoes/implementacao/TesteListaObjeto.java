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
		lista.add(new Cargo("ANALISTA", "JR", 12000));
		System.out.println(lista);
		double total = 0;
		double totalJr =0;
		for(Cargo obj:lista) {
			System.out.println("Nome:" + obj.getNome());
			System.out.println("N�vel:" + obj.getNivel());
			System.out.println("Sal�rio:" + obj.getSalario());
			total += obj.getSalario();
			if(obj.getNivel().equalsIgnoreCase("JR"))
			{
				totalJr+= obj.getSalario();
			}
		}
		System.out.println("Total de sal�rios:" + total);
		
		System.out.println("M�dia dos sal�rios: " + (total/lista.size()));
		System.out.println("Total J�nior:" + totalJr);
		
		
	}
}
