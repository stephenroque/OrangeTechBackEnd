//Desafio: Imóveis Disponíveis

import java.util.Scanner; 
    
public class Program03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        array = frase.split("/", 3);

        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
    }
}