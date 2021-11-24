package EstruturaFor;

import java.util.Scanner;

public class exercicio02_02 {
    public static void main(String[] args) {
        //5
        //14
        //123
        //10
        //-25
        //3

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numermos serão digitados? ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<n; i++) {
            System.out.println("Digite o " + (i+1) + "ºnúmero" );
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();

    }
}
