package Composicao.CorpoHUmano.Membros;

public class Tronco {

   private Perna pernaEsquerda;
   private Perna pernaDireita;
   private Braco bracoEsquerdo;
   private Braco bracoDireito;
   private Cabeca cabeca;

    public Tronco(Perna pernaEsquerda, Perna pernaDireita, Braco bracoEsquerdo, Braco bracoDireito, Cabeca cabeca) {
        this.cabeca = cabeca;
        this.pernaEsquerda = pernaEsquerda;
        this.pernaDireita = pernaDireita;
        this.bracoDireito = bracoDireito;
        this.bracoEsquerdo = bracoEsquerdo;
    }

}
