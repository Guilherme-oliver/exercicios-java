package EstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros serão digitados? ");
        int nvezes = sc.nextInt();

        for (int i = 0; i < nvezes; i++) {
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();

            if (numero2 == 0) {
                System.out.println("Divisão impossivel");
            }
            else {
                double divisao = (double) numero1/numero2;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();

    }


}
