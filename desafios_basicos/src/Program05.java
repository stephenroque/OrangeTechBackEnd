//Desafio: Industria da Multa

import java.util.Scanner; 
    
public class Program05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        String resultado=velocidadeAtual>60?"Foi multado":"Nao foi multado";

        System.out.println(resultado);
    }
}