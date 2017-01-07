package Builder;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * Created by luizcarlosframos on 07/01/17.
 */
public class TestaNotaFiscal {
    public static void main(String[] args) {

        NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();

        NotaFiscal notaFiscal = notaFiscalBuilder.withRazaoSocial("Empresa ECOL")
                .withCNPJ("697979595959")
                .withObservacoes("")
                .withDataAtual()
                .withItem(new ItemDaNota("item 1", 20))
                .withItem(new ItemDaNota("item 2", 30))
                .adicionaAcao(new EnviaPorSMS())
                .adicionaAcao(new ImprimeNota())
                .adicionaAcao(new Multiplicador(2.5))
                .build();
        System.out.println(notaFiscal);

    }
}
