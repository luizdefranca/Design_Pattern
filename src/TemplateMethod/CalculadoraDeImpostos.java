package TemplateMethod;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class CalculadoraDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        double valorDoImposto = imposto.calculaImposto(orcamento);

        System.out.println("Valor do imposto: " + valorDoImposto);
    }
}
