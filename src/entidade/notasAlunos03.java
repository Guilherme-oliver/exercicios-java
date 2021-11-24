package entidade;

public class notasAlunos03 {

    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;
    public double notaFinal;
    public double pontosMinimos = 60.00;

    public double notaFinal(){
        return primeiraNota + segundaNota + terceiraNota;
    }

    public double missing(){
        return (notaFinal - pontosMinimos) * (-1) ;
    }



}
