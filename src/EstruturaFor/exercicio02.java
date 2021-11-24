package EstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
       /* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada: ");
        int n = sc.nextInt();


        for (int i = 0; n >= i; i++){
            if (i <10 || i> 20){
                System.out.println("Fora do intervalo: ");
                System.out.println(i);
            }
            else  {
                System.out.println("Dentro do intervalo: ");
                System.out.println(i);
            }
        }

    }
}
