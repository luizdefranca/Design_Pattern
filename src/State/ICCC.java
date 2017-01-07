package State;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class ICCC extends Imposto {

    public ICCC(Imposto outroImposto){
        super(outroImposto);
    }

    public ICCC(){super();}


    @Override
    public double calculaImposto(Orcamento orcamento) {
        double valorDoImposto;
        double valorDoOrcamento = orcamento.getValor();
        if( valorDoOrcamento < 1000){
            valorDoImposto = valorDoOrcamento * 0.05;
        } else if( valorDoOrcamento <= 3000){
            valorDoImposto = valorDoOrcamento * 0.07;

        }else {

            valorDoImposto = valorDoOrcamento * 0.08 + 30.00;
        }

        return valorDoImposto + calculoDoOutroImposto(orcamento);
    }
}
