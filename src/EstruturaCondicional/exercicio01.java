package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Entrada: ");
        numero = sc.nextInt();
        if (numero < 0 ){
            System.out.println("Numero negativo");
        }
        else {
            System.out.println("Numero positivo");
        }

    }
}
