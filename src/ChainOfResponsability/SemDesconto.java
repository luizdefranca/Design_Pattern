package ChainOfResponsability;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;

    }

    @Override
    public void setProximo(Desconto proximo) {}
}
