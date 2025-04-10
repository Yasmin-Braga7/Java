package trabalhos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercicio1a {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.println("Digite a primeira palavra:");
        String palavra1 = reader.readLine();
        
        System.out.println("Digite a segunda palavra:");
        String palavra2 = reader.readLine();
        
        System.out.println("Digite a terceira palavra:");
        String palavra3 = reader.readLine();
        

        System.out.println(palavra1 + " " + palavra2 + " " + palavra3);
    }
}
