package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class EstadoPositivo implements EstadoDaConta {


    @Override
    public void deposita(Conta conta, double valor) {
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual + valor * 0.98);
    }

    @Override
    public void saca(Conta conta, double valor) {
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual - valor);
        saldoAtual = conta.getSaldo();
        if(saldoAtual <= 0) conta.getEstadoDaConta().mudaPraSaldoNegativo(conta);

    }

    @Override
    public String informaEstado() {
        return "Saldo positivo";
    }

    @Override
    public void mudaPraSaldoNegativo(Conta conta) {
        conta.setEstadoDaConta(new EstadoNegativo());
    }

    @Override
    public void mudaPraSaldoPositivo(Conta conta) {
        throw new RuntimeException("A conta já tem saldo positivo");
    }
}
