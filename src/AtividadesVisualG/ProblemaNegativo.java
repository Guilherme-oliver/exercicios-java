package AtividadesVisualG;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros serão digitados?");
        int n = sc.nextInt();
        int [] vetor = new int[n];

        for (int i = 0 ; i < n ; i++ ){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {

            if (vetor[i] < 0) {
                System.out.println("Número negativo: ");
                System.out.println(vetor[i]);
            }

        }


    }
}
/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
