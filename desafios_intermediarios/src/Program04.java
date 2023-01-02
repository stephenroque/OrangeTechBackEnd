//Desafio: Dc Monalds

import java.util.Scanner; 
import java.util.Arrays; 

public class Program04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        
        listaIngredientes = ingredientes.split(";", 4);

        Arrays.stream(listaIngredientes).forEach(System.out::println);

    }
}