package OrientacaoObjeto;

import entidade.funcionario02;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        /*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
        afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
        projetada abaixo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        funcionario02 x;
        x = new funcionario02();


        System.out.println("Digite o nome do funcionario: ");
        x.nome = sc.next();
        System.out.println("Digite o salario bruto do funcionario: ");
        x.salarioBruto = sc.nextDouble();
        System.out.println("Digite a taxa de imposto do salario: ");
        x.imposto = sc.nextDouble();

        System.out.println("Empregado " +x.nome + " recebe " +x.salarioLiquido() );
        System.out.print("Qual vai ser a porcentagem de aumento no salario: ");
        x.porcentagem = sc.nextDouble();

        System.out.print("Atualizando cadastro: " + x.nome + ", R$" + x.novoSalario());


        sc.close();

    }
}
