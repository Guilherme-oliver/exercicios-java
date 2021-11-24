package EstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0
*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas casas de teste vão ser digitados? ");
        int n = sc.nextInt();
        double media = 0;

        for (int i = 1;i <= n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.println(media);
        }

        sc.close();

    }
}
