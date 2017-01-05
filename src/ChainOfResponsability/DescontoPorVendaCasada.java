package ChainOfResponsability;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class DescontoPorVendaCasada implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(existe("LAPIS", orcamento) && existe("CANETA", orcamento)){
            return orcamento.getValor()*0.05;
        }
        return proximo.desconta(orcamento);
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item: orcamento.getItens() ) {
            if(nomeDoItem == item.getNome()) return true;
        }
        return false;
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
