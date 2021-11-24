package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
       /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Primeiro numero");
        numero1 = sc.nextInt();
        System.out.println("Segundo numero");
        numero2 = sc.nextInt();

       if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
           System.out.println("São multiplos");
       }
       else {
           System.out.println("Não são multiplos");
       }

    }
}
