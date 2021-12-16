package Composicao.Carro;

public class MontagemDoCarro {
    public static void main(String[] args) {

        Roda rodaTraseiraDireita = null;
        Roda rodaTraseiraEsquerda = null;
        Roda rodaDianteiraDireita = null;
        Roda rodaDianteiraEsquerda = null;

        rodaTraseiraDireita = new Roda(rodaTraseiraDireita);
        rodaTraseiraEsquerda = new Roda(rodaTraseiraEsquerda);
        rodaDianteiraDireita = new Roda(rodaDianteiraDireita);
        rodaDianteiraEsquerda = new Roda(rodaDianteiraEsquerda);

        Eixo eixo = new Eixo(rodaTraseiraDireita, rodaTraseiraEsquerda, rodaDianteiraDireita, rodaDianteiraEsquerda);
        Volante volante = new Volante();
        Escapamento escapamento = new Escapamento(true);
        Parabrisa parabrisa = new Parabrisa(Vidro.TEMPERADO);

        Carro carro = new Carro(escapamento, volante, parabrisa, eixo);
        Veiculo veiculo = new Veiculo(carro);



    }
}
