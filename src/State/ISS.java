package State;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class ISS extends Imposto {

    public ISS(Imposto outroImposto){
        super(outroImposto);
    }

    public ISS(){super();}

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor()*0.06 + calculoDoOutroImposto(orcamento);
    }
}
