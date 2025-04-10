package trabalhos;

import java.util.Scanner;

public class Exercicio1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite três palavras:");
        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();
        
        System.out.println(palavra1 + " " + palavra2 + " " + palavra3);
        
        scanner.close();
    }
}
