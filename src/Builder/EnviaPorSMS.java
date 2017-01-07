package Builder;

/**
 * Created by luizcarlosframos on 07/01/17.
 */
public class EnviaPorSMS implements  AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Envie SMS");
    }
}
