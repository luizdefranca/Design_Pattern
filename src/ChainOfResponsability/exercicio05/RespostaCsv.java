package ChainOfResponsability.exercicio05;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class RespostaCsv implements Resposta {
    private Resposta outraResposta;

    public RespostaCsv(Resposta outraResposta) {
        this.outraResposta = null;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.CSV){
            imprime(conta);
        }else {
            outraResposta.responde(req, conta);
        }
    }

    private void imprime(Conta conta) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(conta.getTitular());
        stringBuilder.append(";");
        stringBuilder.append(conta.getSaldo());

        String saida = stringBuilder.toString();

        System.out.println(saida);
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;

    }
}
