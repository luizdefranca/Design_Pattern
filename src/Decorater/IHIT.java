package Decorater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class IHIT extends TemplateImpostoVariavel {
    public IHIT(Imposto outroImposto) {
        super(outroImposto);
    }
    public IHIT(){super();}


    @Override
    protected boolean condicaoDeCobranca(Orcamento orcamento) {
        return (temDoisItensComOMesmoNome(orcamento));
    }

    private boolean temDoisItensComOMesmoNome(Orcamento orcamento) {
//      Método criado por mim
//      List<Item> itensImutavel = orcamento.getItens();
//       List<Item> itensOrdenados = new ArrayList<>(itensImutavel);
//        itensOrdenados.sort(Comparator.comparing(Item::getNome));
//        String nomeAnterior="";
//        for (Item item :
//                itensOrdenados) {
//            if(nomeAnterior == item.getNome()){
//                return true;
//            }
//            nomeAnterior = item.getNome();
//        }
//        return false;
//        Forma sugerida pelo Alura
        List<String> listaDeNomes = new ArrayList<>();
        for (Item item :
                orcamento.getItens()) {
            if(listaDeNomes.contains(item.getNome())) return true;
            else{ listaDeNomes.add(item.getNome());
            }
        }
        return false;
    }

    @Override
    protected double aplicaPrimeiraCondicao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100.00 + calculoDoOutroImposto(orcamento);
    }

    @Override
    protected double aplicaSegundaCondicao(Orcamento orcamento) {
        return orcamento.getValor() * 0.01 * numeroDeItens(orcamento) + calculoDoOutroImposto(orcamento);
    }

    private double numeroDeItens(Orcamento orcamento) {
        return orcamento.getItens().size();
    }
}
