package entidade;

public class funcionario02 {

    public String nome;
    public double salarioBruto;
    public double imposto;
    public double porcentagem;


    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double aumento() {
        return salarioBruto * porcentagem / 100;
    }

    public double novoSalario() {
        return salarioLiquido() + aumento();
    }

}
