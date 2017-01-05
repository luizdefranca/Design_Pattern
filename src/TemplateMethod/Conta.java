package TemplateMethod;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class Conta {

    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }
}
