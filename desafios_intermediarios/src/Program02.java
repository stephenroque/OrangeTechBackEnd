//Desafio: Pontos na Carteira

import java.util.Scanner; 
    
public class Program02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        multas = velocidade>80 ? ++multas : multas;

        String resultado = multas>=3 ? multas + " multas. Levou pontos na carteira" : multas+  " multas. Nao levou pontos na carteira";

        System.out.println(resultado);
    }
}