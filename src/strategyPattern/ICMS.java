package strategyPattern;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class ICMS implements Imposto{

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50.00;
    }
}
