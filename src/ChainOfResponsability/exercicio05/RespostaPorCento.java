package ChainOfResponsability.exercicio05;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class RespostaPorCento implements  Resposta {

    private Resposta outraResposta;

    public RespostaPorCento(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.PERCENT){
            imprime(conta);
        }else{
            outraResposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;

    }

    private void imprime(Conta conta) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(conta.getTitular());
        stringBuilder.append("%");
        stringBuilder.append(conta.getSaldo());

        String saida = stringBuilder.toString();

        System.out.println(saida);
    }

}
