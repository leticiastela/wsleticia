package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Informe a Disciplina:").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe o n�mero de faltas:"));
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota:"));
		float media = (nota1 + nota2)/2;
		if(faltas>20)
		{
			System.out.println("Voc� foi reprovado pelo n�mero de faltas :( ");
		}
		else
		{
			System.out.println("Sua m�dia na Disciplina " + disciplina + " �: " + media);
			if(media >= 6)
			{
				System.out.println("Parab�ns, voc� foi aprovado!!");
			}
			else if(media < 4)
			{
				System.out.println("Voc� foi reprovado :( ");
			}
			else
			{
				System.out.println("Voc� tem chances no exame!");
			}
		}
		
	}

}
