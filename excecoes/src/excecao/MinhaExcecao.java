package excecao;

public class MinhaExcecao {
	
	public static String tratar(Exception ex) {
		if(ex instanceof NumberFormatException)
		{
			return "N�mero Inv�lido!";
		}
		else if (ex instanceof NullPointerException) {
			return "Objeto nulo!";
		}
		else if(ex instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor Estourou!";
		}
		else
		{
			ex.printStackTrace();
			return "Erro desconhecido!";
		}
	}

}
