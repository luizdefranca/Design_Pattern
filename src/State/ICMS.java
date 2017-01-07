package State;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto){
        super(outroImposto);
    }

    public ICMS(){super();}

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50.00 +calculoDoOutroImposto(orcamento);
    }
}
