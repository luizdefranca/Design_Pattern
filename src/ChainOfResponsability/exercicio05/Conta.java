package ChainOfResponsability.exercicio05;

import org.apache.commons.lang.NullArgumentException;

import java.math.BigDecimal;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        if(titular == null) {
            throw new  NullArgumentException("Campos titular e saldo obrigatorios");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
