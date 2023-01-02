//Desafio: Salvando Músicas

import java.util.Scanner; 
    
public class Program01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        String resultado = arquivoDoPc.endsWith(".mp3")?"Salvar":"Deletar";

        System.out.println(resultado);

    }
}