package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Horario inicial: ");
        horaInicial = sc.nextInt();
        System.out.println("Horario final: ");
        horaFinal = sc.nextInt();
        duracao = (24 - horaInicial) + horaFinal;

        System.out.println("O jogo teve a duração de: " + duracao + " Horas");


    }
}
