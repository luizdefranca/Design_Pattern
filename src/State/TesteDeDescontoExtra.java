package State;

/**
 * Created by luizcarlosframos on 06/01/17.
 */
public class TesteDeDescontoExtra {

    public static void main(String[] args) {

        Orcamento reforma = new Orcamento(500);

        System.out.println("reforma = " + reforma.informaEstado());
        System.out.println("reforma = " + reforma.getValor());

        reforma.aplicaDescontoExtra();
        System.out.println("reforma = " + reforma.informaEstado());
        System.out.println("reforma = " + reforma.getValor());

        reforma.aprova();

        reforma.aplicaDescontoExtra();
        System.out.println("reforma = " + reforma.informaEstado());
        System.out.println("reforma = " + reforma.getValor());

        reforma.finaliza();
        reforma.aplicaDescontoExtra();
        System.out.println("reforma = " + reforma.informaEstado());
        System.out.println("reforma = " + reforma.getValor());
    }
}
