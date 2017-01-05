package ChainOfResponsability.exercicio05;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public interface Resposta {
    void responde(Requisicao req, Conta conta);

    void setProxima(Resposta resposta);
}
