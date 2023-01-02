//Desafio: Leitura da Gertrudes

import java.util.Scanner; 
    
public class Program03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        System.out.println(paginas/paginasLidas + " dias");

    }
}