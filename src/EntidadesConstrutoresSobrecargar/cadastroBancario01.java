package EntidadesConstrutoresSobrecargar;

public class cadastroBancario01 {
    public String nome;
    public  int numeroDaConta;
    double valorDepositoInicial;
    char depositoInicial;
    double novoDeposito;
    char resposta;
    double saque;
    double taxa = 5.00;

    public void addDeposito(double novoDeposito){
         this.depositoInicial += novoDeposito;
    }

    public void removeDeposito(double saque) {
        this.depositoInicial -= saque - taxa;
    }

}
