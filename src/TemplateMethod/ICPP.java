package TemplateMethod;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class ICPP extends TemplateImpostoVariavel {
    @Override
    protected boolean condicaoDeCobranca(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    protected double aplicaPrimeiraCondicao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 ;
    }

    @Override
    protected double aplicaSegundaCondicao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
