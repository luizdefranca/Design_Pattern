package State;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public abstract class TemplateImpostoVariavel extends Imposto {

    protected  TemplateImpostoVariavel(Imposto outroImposto){
        super(outroImposto);
    }

    protected TemplateImpostoVariavel() {
        super();
    }

    @Override
    public final double calculaImposto(Orcamento orcamento) {
        if(condicaoDeCobranca(orcamento)){
            return aplicaPrimeiraCondicao(orcamento);
        } else{
            return aplicaSegundaCondicao(orcamento);
        }


    }

    //Check if the condition is satisfied
    protected abstract boolean condicaoDeCobranca(Orcamento orcamento);

    //If the condition above is satisfied, run this method
    protected abstract double aplicaPrimeiraCondicao(Orcamento orcamento);

    //If the condition is not satisfied, run this another
    protected abstract double aplicaSegundaCondicao(Orcamento orcamento);
}
