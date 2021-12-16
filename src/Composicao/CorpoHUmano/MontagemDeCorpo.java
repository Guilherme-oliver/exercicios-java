package Composicao.CorpoHUmano;

import Composicao.CorpoHUmano.Membros.*;

public class MontagemDeCorpo {
    public static void main(String[] args) {

        Braco bracoEsquerdo = new Braco(Orientacao.ESQUERDO);
        Braco bracoDireito = new Braco(Orientacao.DIREITO);
        Perna pernaEsquerda = new Perna(Orientacao.ESQUERDO);
        Perna pernaDireita = new Perna(Orientacao.DIREITO);
        Cabeca cabeca = new Cabeca(true);

        Tronco tronco = new Tronco(pernaEsquerda, pernaDireita, bracoEsquerdo, bracoDireito, cabeca);
        CorpoHumano corpoHumano = new CorpoHumano(tronco);

                

    }
}
