package TemplateMethod;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class ISS implements Imposto {
    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor()*0.06;
    }
}
