package OrientacaoObjeto;

import entidade.notasAlunos03;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        resolver este problema.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        notasAlunos03 x;
        x = new notasAlunos03();


        System.out.println("Nome do aluno: ");
        x.nome = sc.next();
        System.out.println("Digite a primeira nota: ");
        x.primeiraNota = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        x.segundaNota = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        x.terceiraNota = sc.nextDouble();

        if (x.pontosMinimos < x.notaFinal()) {
            System.out.println("Nota final: " + x.notaFinal());
            System.out.println("Passou");
        }
        else {
            System.out.println("Nota final: " + x.notaFinal());
            System.out.println("Reprovado");
            System.out.println("Faltou: " + x.missing());
        }
        sc.close();
    }
}
