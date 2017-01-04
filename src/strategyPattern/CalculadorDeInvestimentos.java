package strategyPattern;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class CalculadorDeInvestimentos {

    public void investe(Conta conta, Investimento investimento){
        double dividendo = investimento.calcula(conta);
        conta.deposita(dividendo * 0.75);
        System.out.println("Seu saldo: " + conta.getSaldo());

    }
}
