package ChainOfResponsability.exercicio05;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class TesteRequisicao {

    public static void main(String[] args) {
        Conta paulo = new Conta("Paulo", 453.90);

        Requisicao requisicao = new Requisicao(Formato.PERCENT);

        requisicao.executaRequisicao(paulo);
    }
}
