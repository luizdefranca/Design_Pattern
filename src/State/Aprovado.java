package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class Aprovado implements EstadoDeUmOrcamento {

    public  void aplicaDescontoExtra(Orcamento orcamento){

        if (orcamento.getDescontoAplicado() == false) {
            double desconto = orcamento.getValor() * 0.02;
            double novoValorDoOrcamento = orcamento.getValor() - desconto;

            orcamento.setValor(novoValorDoOrcamento);
            orcamento.setDescontoAplicado(true);
        } else {
            throw new RuntimeException("Já foi aplicado desconto no orçamento aprovador!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já aprovado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw  new RuntimeException("Orçamento aprovado não pode ser reprovado. ");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }

    @Override
    public String informaEstado() {
        return "Aprovado";
    }
}
