package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Codigo - Especificação  -  Preço");
        System.out.println("  1  =   Cachorro quente   = R$4.00");
        System.out.println("  2  =   X-Salada          = R$4.50");
        System.out.println("  3  =   X-Bacon           = R$5.00");
        System.out.println("  4  =   Torrada Simples   = R$2.00");
        System.out.println("  5  =   Refrigerante      = R$1.50");

        System.out.println("Você deseja fazer o seu pedido? ");
        char resposta = sc.next().charAt(0);

        while (resposta != 'N'){

            System.out.println("Qual o numero do seu pedido? ");
            int codigo = sc.nextInt();
            System.out.println("Qual a quantidade? ");
            int quantidade = sc.nextInt();
            double total = 0;

            if (codigo == 1) {
                total = 4.00 * quantidade;
            } else if (codigo == 2) {
                total = 4.50 * quantidade;
            } else if (codigo == 3) {
                total = 5.00 * quantidade;
            } else if (codigo == 4) {
                total = 2.00 * quantidade;
            } else if (codigo == 5) {
                total = 1.50 * quantidade;
            } else if (codigo > 5 || codigo < 0) {
                System.out.print("Codigo invalido");
            }

            System.out.printf("Total: R$ %.2f%n", total);
            System.out.println("Deseja fazer mais algum pedido? ");
            resposta = sc.next().charAt(0);

        }

        sc.close();

    }
}
