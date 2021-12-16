package Composicao.Carro;

public class Eixo {

    private Roda rodaTraseiraDireita;
    private Roda rodaTraseiraEsquerda;
    private Roda rodaDianteiraDireita;
    private Roda rodaDianteiraEsquerda;

    public Eixo(Roda rodaTraseiraDireita, Roda rodaTraseiraEsquerda, Roda rodaDianteiraDireita, Roda rodaDianteiraEsquerda) {
        this.rodaTraseiraDireita = rodaTraseiraDireita;
        this.rodaTraseiraEsquerda = rodaTraseiraEsquerda;
        this.rodaDianteiraDireita = rodaDianteiraDireita;
        this.rodaDianteiraEsquerda = rodaDianteiraEsquerda;
    }

    public Roda getRodaTraseiraDireita() {
        return rodaTraseiraDireita;
    }


    public Roda getRodaTraseiraEsquerda() {
        return rodaTraseiraEsquerda;
    }


    public Roda getRodaDianteiraDireita() {
        return rodaDianteiraDireita;
    }


    public Roda getRodaDianteiraEsquerda() {
        return rodaDianteiraEsquerda;
    }

}
