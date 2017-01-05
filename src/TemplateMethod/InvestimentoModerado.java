package TemplateMethod;

import java.util.Random;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class InvestimentoModerado implements Investimento {

    private Random random;

    public InvestimentoModerado(){
        this.random = new Random();
    }
    @Override
    public double calcula(Conta conta) {

            double rendimento;

            if(random.nextBoolean()){
                rendimento = conta.getSaldo() * 0.025;

            }else{
                rendimento = conta.getSaldo() * 0.007;
            }
            return rendimento;

    }
}
