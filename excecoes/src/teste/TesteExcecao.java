package teste;

import excecao.MinhaExcecao;

public class TesteExcecao {
	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt("6");
			System.out.println("Valor:" + numero);
			
			String palavra = "teste";
			System.out.println("Qtde letras: " + palavra.length());
			
			int numeros[] = new int[3];
			numeros[0] = 542;
			numeros[1]=100;
			numeros[2] = 10;
			
			for(int posicao = 0; posicao<numeros.length;posicao++) {
				System.out.println("Valor: " +numeros[posicao]);
			}
			
			
			
		}
		catch(Exception ex) {
			System.out.println(MinhaExcecao.tratar(ex));
		}
	}
}
