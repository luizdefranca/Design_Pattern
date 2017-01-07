package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class EstadoNegativo implements EstadoDaConta {


    @Override
    public void deposita(Conta conta, double valor) {
        double valorAtual = conta.getSaldo();
        conta.setSaldo(valorAtual + 0.95 * valor);
        valorAtual = conta.getSaldo();
        if (valorAtual > 0 ) conta.getEstadoDaConta().mudaPraSaldoPositivo(conta);
    }

    @Override
    public void saca(Conta conta, double valor) {
        throw new RuntimeException("Saldo Negativo. Saque não permitido.");

    }

    @Override
    public String informaEstado() {
        return "Saldo Negativo";
    }

    @Override
    public void mudaPraSaldoNegativo(Conta conta) {
        throw new RuntimeException("Conta já tem o saldo negativo.");
    }

    @Override
    public void mudaPraSaldoPositivo(Conta conta) {
        conta.setEstadoDaConta(new EstadoPositivo());

    }
}
