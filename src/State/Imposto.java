package State;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public abstract class Imposto {

    protected final Imposto outroImposto;

    protected Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected Imposto(){
        this.outroImposto = null;
    }


    public abstract double calculaImposto(Orcamento orcamento);

    public double calculoDoOutroImposto(Orcamento orcamento){
        if(outroImposto == null) return 0;
        return outroImposto.calculaImposto(orcamento);
    }
}
