package State;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by luizcarlosframos on 04/01/17.
 */
public class Orcamento {

    private double valor;
    private final List<Item> itens;
    private EstadoDeUmOrcamento estadoAtual;
    private boolean descontoAplicado = false;

    //Constants
    public static final int EM_APROVACAO = 1;
    public static final int APROVADO = 2;
    public static final int REPROVADO = 3;
    public static final int FINALIZADO = 4;


    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }


    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescontoAplicado(boolean descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }

    public boolean getDescontoAplicado(){
        return this.descontoAplicado;
    }
    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public void adicionaItem(Item item){
        this.itens.add(item);


    }


    public void aplicaDescontoExtra() {

        this.estadoAtual.aplicaDescontoExtra(this);
    }

    public EstadoDeUmOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void aprova(){
        this.estadoAtual.aprova(this);
    }

    public void reprova(){
        this.estadoAtual.reprova(this);
    }

    public void finaliza(){
        this.estadoAtual.finaliza(this);
    }

    public String informaEstado(){
        return this.estadoAtual.informaEstado();
    }
}