package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Informe a Disciplina:").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota:"));
		float media = (nota1 + nota2)/2;
		System.out.println("Sua m�dia na Disciplina " + disciplina + " �: " + media);
		if(media >= 6)
		{
			System.out.println("Parab�ns, voc� foi aprovado!!");
		}
		else
		{
			System.out.println("Voc� foi reprovado :( ");
		}
	}

}
