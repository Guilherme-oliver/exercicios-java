package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Enter number");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero par");

        }
        else {
            System.out.println("Numero Impar");
        }
    }
}
