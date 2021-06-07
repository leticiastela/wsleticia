package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Graduacao;
import br.com.unixyz.modelo.Pos;
import util.Magica;

public class TesteCurso {
	public static void main(String[] args) {
		
		int opcao = Magica.i("Digite 1 para Gradua��o ou 2 para P�s:");
		
		while(opcao != 1 && opcao != 2)
		{
			opcao = Magica.i("Digite 1 para Gradua��o ou 2 para P�s:");
		}
		Curso objCurso = new Curso();
		if(opcao==1) {
			objCurso = new Graduacao(
					Magica.s("Nome:"),
					Magica.s("Titula��o:"),
					Magica.d("Valor:"),
					Magica.i("Carga Hor�ria:"),
					Magica.s("Projeto Conclus�o:"),
					Magica.i("Carga Hor�ria Est�gio:")
					);
		}
		else
		{
			objCurso = new Pos(
					Magica.s("Nome:"),
					Magica.s("Titula��o:"),
					Magica.d("Valor:"),
					Magica.i("Carga Hor�ria:"),
					Magica.b("Interc�mbio?"),
					Magica.s("N�vel:")
					);
		}
		System.out.println(objCurso.toString());
		
	}

}
