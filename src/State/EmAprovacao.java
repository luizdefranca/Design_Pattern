package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class EmAprovacao implements EstadoDeUmOrcamento{

    public  void aplicaDescontoExtra(Orcamento orcamento){

        if (orcamento.getDescontoAplicado() == false) {
            double desconto = orcamento.getValor() * 0.05;
            double novoValorDoOrcamento = orcamento.getValor() - desconto;

            orcamento.setValor(novoValorDoOrcamento);
            orcamento.setDescontoAplicado(true);
        } else {
            throw  new RuntimeException("Desconto já aplicado para orçamento em aprovação!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
        orcamento.setDescontoAplicado(false);
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento em aprovação não pode ir direto para finalizado");

    }

    @Override
    public String informaEstado() {
        return "Em Aprovacação";
    }
}
