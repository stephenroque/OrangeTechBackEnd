//Desafio: Lojinha de Doces

import java.util.Scanner; 
    
public class Program04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        
        System.out.println("O cliente obteve " + doce*2 + " doces");

    }
}