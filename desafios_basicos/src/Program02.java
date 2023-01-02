//Desafio: Download de Pacotes

import java.util.Scanner; 
    
public class Program02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        String porcentagem = "";

        for (int i = 0; i < tamanho; i++) {
            porcentagem = porcentagem + "/";
        }

        System.out.println(porcentagem);
    }
}