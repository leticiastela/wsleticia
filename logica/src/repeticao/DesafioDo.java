package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	public static void main(String[] args) {
		float numeroJogador1 = Float.parseFloat(JOptionPane.showInputDialog("Jogador 1 - Digite o n�mero:"));
		float numeroJogador2 = 0;
		int cont = 0;
		do{
			numeroJogador2 = Float.parseFloat(JOptionPane.showInputDialog("Jogador 2 - Digite o n�mero:"));
			if(numeroJogador1 > numeroJogador2)
			{
				JOptionPane.showMessageDialog(null, "O n�mero correto � maior do que o n�mero informado!");
			}
			else if(numeroJogador1 < numeroJogador2)
			{
				JOptionPane.showMessageDialog(null,"O n�mero correto � menor do que o n�mero informado!");
			}
			cont++;
		}
		while(numeroJogador1 != numeroJogador2);
		JOptionPane.showMessageDialog(null,"Parab�ns, voc� acertou com: " + cont + " tentativas!");
	}
}
