package Decorater;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto outroImposto){
        super(outroImposto);
    }

    public ImpostoMuitoAlto(){super();}

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor()*0.20 + calculoDoOutroImposto(orcamento);
    }
}
