package trabalhos;

import javax.swing.JOptionPane;

public class Exercicio6a {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		
		for(int i = 0; i < 100; i++) {
			System.out.println(nome);
		}
	}
}
