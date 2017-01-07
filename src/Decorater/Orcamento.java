package Decorater;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class Orcamento {
    private final double valor;
    private final List<Item> itens;


    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }


    public double getValor() {
        return this.valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public void adicionaItem(Item item){
        this.itens.add(item);


    }


}