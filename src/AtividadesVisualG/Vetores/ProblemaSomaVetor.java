package AtividadesVisualG.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Quantos números você vai digitar?  ");
        int n = sc.nextInt();
        int [] vetor = new int[n];
        int media = soma / n;

        for (int i = 0; i < n ; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Valores: ");
        for (int i = 0; i < n ; i++){
            System.out.println(vetor[i]);
            soma += vetor[i];
            media = soma / n;
        }
        System.out.println("Soma: " + soma + " Média: " + media);




    }
}
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor

 */
