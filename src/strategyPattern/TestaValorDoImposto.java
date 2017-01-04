package strategyPattern;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class TestaValorDoImposto {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(100);

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iccc = new ICCC();
        new CalculadoraDeImpostos().realizaCalculo(orcamento,icms);
        new CalculadoraDeImpostos().realizaCalculo(orcamento,iss);
        new CalculadoraDeImpostos().realizaCalculo(orcamento,iccc);


    }
}
