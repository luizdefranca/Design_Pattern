package ChainOfResponsability;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class Item {

    private final String nome;
    private final double valor;



    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.getValor(), getValor()) != 0) return false;
        return getNome().equals(item.getNome());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNome().hashCode();
        temp = Double.doubleToLongBits(getValor());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getNome() {

        return nome;
    }

    public double getValor() {
        return valor;
    }
}
