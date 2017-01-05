package TemplateMethod;


import ChainOfResponsability.CalculadorDeDescontos;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class TestaTemplateMethod {
    public static void main(String[] args) {


        Orcamento orcamento = new Orcamento(504);
        orcamento.adicionaItem(new Item("Lapis", 250));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Caneta", 50));
        orcamento.adicionaItem(new Item("Borracha", 4));

        Imposto icpp = new ICPP();
        System.out.format("icpp =  %.2f", icpp.calculaImposto(orcamento));
        System.out.println();

        Imposto ikcv = new IKCV();
        System.out.format("ikcv =  %.2f", ikcv.calculaImposto(orcamento));
        System.out.println();

        Imposto ihit = new IHIT();
        System.out.format("ikcv =  %.2f", ihit.calculaImposto(orcamento));


    }
}
