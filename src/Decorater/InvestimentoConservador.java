package Decorater;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class InvestimentoConservador implements Investimento {


    @Override
    public double calcula(Conta conta) {

        double rendimento;
        rendimento = conta.getSaldo() * 0.008;
        return rendimento;
    }
}
