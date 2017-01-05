package ChainOfResponsability.exercicio05;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class RespostaXml implements Resposta {

    public RespostaXml(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    private Resposta outraResposta;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.XML){
            imprimeXML(conta);
        }else {
            outraResposta.responde(req, conta);
        }


    }

    private void imprimeXML(Conta conta) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<conta>");
        stringBuilder.append("<titular>");
        stringBuilder.append(conta.getTitular());
        stringBuilder.append("</titular>");
        stringBuilder.append("<saldo>");
        stringBuilder.append(conta.getSaldo());
        stringBuilder.append("</saldo>");
        stringBuilder.append("</conta>");

        String saida = stringBuilder.toString();

        System.out.println(saida);

    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;

    }
}
