package State;

import java.util.Calendar;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class Conta {

    private double saldo;

    private Calendar dataAbertura;
    private EstadoDaConta estadoDaConta;


    public Conta(double saldo){
        this.saldo = saldo;
        this.estadoDaConta = new EstadoPositivo();

    }
    public Conta(double saldo, Calendar dataAbertura){
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.estadoDaConta = new EstadoPositivo();
    }

    public Calendar getDataAbertura() {
        return this.dataAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {

        estadoDaConta.deposita(this, valor);
    }

    public void saca(double valor){
        estadoDaConta.saca(this, valor);
    }

    public void mudaPraSaldoNegativo(Conta conta) {
        estadoDaConta.mudaPraSaldoNegativo(conta);
    }

    public void mudaPraSaldoPositivo(Conta conta) {
        estadoDaConta.mudaPraSaldoPositivo(conta);
    }

    public EstadoDaConta getEstadoDaConta() {
        return  this.estadoDaConta;
    }

    public void setEstadoDaConta(EstadoDaConta estadoDaConta) {
        this.estadoDaConta = estadoDaConta;
    }

    public String informaEstado() {
        return estadoDaConta.informaEstado();
    }


    //// TODO: 06/01/17 Melhorar este método para que saia a data correta
//    @Override
//    public String toString() {
//        return "[saldo: " + this.saldo + ", data: "
//                + dataAbertura.get(Calendar.DAY_OF_MONTH) + "/"
//                + dataAbertura.get(Calendar.MONTH) + "/"
//                + dataAbertura.get(Calendar.YEAR) + "]";
//    }


    @Override
    public String toString() {
        return "Saldo: " + getSaldo() + " Estado: " + informaEstado();
    }
}
