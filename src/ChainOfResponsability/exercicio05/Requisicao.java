package ChainOfResponsability.exercicio05;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class Requisicao {
    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return this.formato;
    }

    public void executaRequisicao(Conta conta){

        // Primeira forma passando a resposta por um método
//
//        RespostaPorCento r1 = new RespostaPorCento();
//        RespostaXml r2 = new RespostaXml();
//        RespostaCsv r3 = new RespostaCsv();
//
//        r1.setProxima(r2);

//        r2.setProxima(r3);
//


        //Segunda forma passando a resposta pelo construtor
        RespostaPorCento r1 = new RespostaPorCento(new RespostaXml(new RespostaCsv(null)));
//        RespostaCsv r1 = new RespostaCsv(new RespostaPorCento(new RespostaXml(null)));
        r1.responde(this, conta);

    }
}
