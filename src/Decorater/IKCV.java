package Decorater;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class IKCV extends TemplateImpostoVariavel {

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }
    public IKCV(){super();}

    @Override
    protected boolean condicaoDeCobranca(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemSuperiorAQuinhentos(orcamento);
    }

    private boolean temItemSuperiorAQuinhentos(Orcamento orcamento) {
        for (Item item: orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }
        return false;
    }

    @Override
    protected double aplicaPrimeiraCondicao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10 + calculoDoOutroImposto(orcamento);
    }

    @Override
    protected double aplicaSegundaCondicao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
    }
}
