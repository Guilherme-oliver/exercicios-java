package EstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
       // Ler um número inteiro N e calcular todos os seus divisores.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i ++ ) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
