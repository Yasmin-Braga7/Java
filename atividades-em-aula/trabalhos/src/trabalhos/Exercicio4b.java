package trabalhos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercicio4b {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Digite a primeira nota: ");
            double nota1 = Double.parseDouble(br.readLine());
            
            System.out.print("Digite a segunda nota: ");
            double nota2 = Double.parseDouble(br.readLine());
            
            System.out.print("Digite a terceira nota: ");
            double nota3 = Double.parseDouble(br.readLine());
   
            
            double media = (nota1 + nota2 + nota3) / 3;
            
            System.out.println("A media foi: " + media);
            
            if (media >= 6) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler os dados. " + e.getMessage());
        }
    }
}
