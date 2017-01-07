package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class Reprovado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
         throw new RuntimeException("Orçamento Reprovado não tem desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento reprovado não pode ser aprovado!");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("O orçamento já está reprovado");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());

    }

    @Override
    public String informaEstado() {
        return "Reprovado";
    }
}
