package trabalhos;

import javax.swing.JOptionPane;

public class Exercicio4c {
	public static void main(String[] args) {
        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
        String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota:");


        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double nota3 = Double.parseDouble(nota3Str);

        
        double media = (nota1 + nota2 + nota3) / 3;

        
        String resultado;
        if (media >= 6) {
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        }

        
        JOptionPane.showMessageDialog(null, "Média: " + media + "\nResultado: " + resultado);
    }
}
