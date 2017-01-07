package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public interface EstadoDaConta {

    //Métodos comuns
    public void deposita(Conta conta, double valor);
    public void saca(Conta conta, double valor);
    public String informaEstado();


    //Métodos para transição de Estado
    public void mudaPraSaldoNegativo(Conta conta);
    public void mudaPraSaldoPositivo(Conta conta);

}
