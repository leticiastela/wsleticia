package variaveis;

public class ManipulaString {
	public static void main(String[] args) {
		String email = "LeTicIA.STELA@itau-UNIBANCO.com.bR";
		System.out.println("Original:" + email);
		System.out.println("Min�sculo:" + email.toLowerCase());
		System.out.println("Min�sculo:" + email.toUpperCase());
		System.out.println("Cont�m @?" + email.contains("@"));
		System.out.println("Posi��o do @:" + email.indexOf("@"));
		System.out.println("Quantidade de caracteres:" + email.length());
		System.out.println("2 ao 5 caractere:" + email.substring(1,5));
		System.out.println("Primeira metade:" + email.substring(0, email.length()/2));
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
		System.out.println("Primeiro Caractere:" + email.charAt(0));
	}

}
