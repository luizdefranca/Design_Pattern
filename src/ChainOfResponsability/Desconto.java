package ChainOfResponsability;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto proximo);

}
