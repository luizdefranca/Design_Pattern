package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class Finalizado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado não tem desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado");
    }

    @Override
    public String informaEstado() {
        return "Finalizado";
    }
}
