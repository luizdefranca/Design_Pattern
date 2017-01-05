package ChainOfResponsability;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class TestaDesconto {
    public static void main(String[] args) {

        CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();
        Orcamento orcamento = new Orcamento(504);
        orcamento.adicionaItem(new Item("Lapis", 250));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Borracha", 4));

        double desconto = calculadorDeDescontos.calcula(orcamento);



        System.out.format("desconto = %.2f", desconto);
    }
}
