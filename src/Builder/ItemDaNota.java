package Builder;

/**
 * Created by luizcarlosframos on 07/01/17.
 */
public class ItemDaNota {

    private String descricao;
    private double valor;

    public ItemDaNota(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

class ItemDaNotaBuilder {
    private String descricao;
    private double valor;

    public ItemDaNotaBuilder comDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ItemDaNotaBuilder comValor(double valor) {
        this.valor = valor;
        return this;
    }

    public ItemDaNota constroi() {
        return new ItemDaNota(descricao, valor);
    }
}
