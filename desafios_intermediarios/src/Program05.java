//Desafio: Camarote do Blue Cold Ice Cubes

import java.util.Scanner; 
    
public class Program05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        pessoasNoCamarote = (int)Math.ceil((float)tamanhoDaFila/2);

        System.out.println(pessoasNoCamarote + " pessoas no camarote");

    }
}