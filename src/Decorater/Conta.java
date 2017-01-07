package Decorater;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class Conta {

    private double saldo;

    private Calendar dataAbertura;


    public Conta(double saldo, Calendar dataAbertura){
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public Calendar getDataAbertura() {
        return this.dataAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "[saldo: " + this.saldo + ", data: "
                + dataAbertura.get(Calendar.DAY_OF_MONTH) + "/"
                + dataAbertura.get(Calendar.MONTH) + "/"
                + dataAbertura.get(Calendar.YEAR) + "]";
    }
}
