package Composicao.Carro;

public class Carro {

    private Eixo eixo;
    private Volante volante;
    private Parabrisa parabrisa;
    private Escapamento escapamento;
    private Parabrisa vidro;

    public Carro(Eixo eixo, Volante volante, Parabrisa parabrisa, Escapamento escapamento, Parabrisa vidro) {
        this.eixo = eixo;
        this.volante = volante;
        this.parabrisa = parabrisa;
        this.escapamento = escapamento;
        this.vidro = vidro;
    }

    public Carro(Escapamento escapamento, Volante volante, Parabrisa parabrisa, Eixo eixo) {
    }
}
