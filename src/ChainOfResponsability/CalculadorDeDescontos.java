package ChainOfResponsability;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class CalculadorDeDescontos {

    public double calcula(Orcamento orcamento){
        DescontoPorMaisDeCincoItens primeiroDesconto = new DescontoPorMaisDeCincoItens();
        DescontoPorMaisDeQuinhentosReais segundoDesconto = new DescontoPorMaisDeQuinhentosReais();
        DescontoPorVendaCasada terceiroDesconto = new DescontoPorVendaCasada();
        SemDesconto semDesconto = new SemDesconto();
        primeiroDesconto.setProximo(segundoDesconto);
        segundoDesconto.setProximo(terceiroDesconto);
        terceiroDesconto.setProximo(semDesconto);


        return primeiroDesconto.desconta(orcamento);

    }
}
