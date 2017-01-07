package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class TestaEstadoDaConta {

    public static void main(String[] args) {
        Conta conta = new Conta(500.00);

        System.out.println("[conta = " + conta + "]");

        conta.saca(600);
        System.out.println("[conta = " + conta + "]");

        conta.deposita(100);
        System.out.println("[conta = " + conta + "]");

        conta.deposita(100);
        System.out.println("[conta = " + conta + "]");

        conta.deposita(100);
        System.out.println("[conta = " + conta + "]");

    }
}
