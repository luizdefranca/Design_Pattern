package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public interface EstadoDeUmOrcamento {
    public  void aplicaDescontoExtra(Orcamento orcamento);

    public void aprova(Orcamento orcamento);
    public void reprova(Orcamento orcamento);
    public void finaliza(Orcamento orcamento);
    public String informaEstado();
}
