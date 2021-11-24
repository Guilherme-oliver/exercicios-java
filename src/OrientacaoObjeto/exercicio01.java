package OrientacaoObjeto;

import entidade.retangulo01;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Fazer um programa para ler os valores da largura e altura
        //de um retângulo. Em seguida, mostrar na tela o valor de
        //sua área, perímetro e diagonal. Usar uma classe como
        //mostrado no projeto ao lado.
        // Enter rectangle width and height:
        //3.00
        //4.00
        //AREA = 12.00
        //PERIMETER = 14.00
        //DIAGONAL = 5.0
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        retangulo01 x;
        x = new retangulo01();


        System.out.println("Digite a largura do triangulo: ");
        x.largura = sc.nextDouble();
        System.out.println("Digite a altura do triangulo: ");
        x.altura = sc.nextDouble();



        System.out.println(x.area());
        System.out.println(x.perimetro());
        System.out.println(x.diagonal());

        sc.close();

    }
}
