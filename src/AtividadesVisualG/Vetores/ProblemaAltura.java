package AtividadesVisualG.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAltura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?  ");
        int n = sc.nextInt();
        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];
        double[] vetorAltura = new double[n];
        double soma = 0;
        double mediaAltura = 0;
        int count = 0;
        double porcentagem;

        for (int i = 0; i < n ; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa" );
            System.out.print("Nome: ");
            vetorNome[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();
            soma += vetorAltura[i];
            mediaAltura = soma / n;

        }

        for (int i = 0; i < n ; i ++){
            if (vetorIdade[i] < 16){
                count += 1;
            }
        }

        porcentagem = count * 100 / n;
        System.out.println("Altura média: " + mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        for (int i = 0; i < n ; i++ ){
            if (vetorIdade[i] < 16){
                System.out.println(vetorNome[i]);
            }
        }


    }
}
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */