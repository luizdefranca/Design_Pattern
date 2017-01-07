package Decorater;

import java.util.Random;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class InvestimentoArrojado implements Investimento {

    private Random random;

    public InvestimentoArrojado(){
        this.random = new Random();
    }
    @Override
    public double calcula(Conta conta) {
        int chute = random.nextInt(10);
        double rendimento;
        if(chute <= 1) {
            rendimento = conta.getSaldo() * 0.05;
        }else if (chute > 1 || chute <=4){
            rendimento = conta.getSaldo() * 0.03;
        }else {
            rendimento = conta.getSaldo() * 0.006;
        }

        return rendimento;
    }
}
