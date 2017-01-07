package Builder;

import com.intellij.openapi.editor.actions.LangIndentSelectionAction;

import java.util.Calendar;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/**
 * Created by luizcarlosframos on 07/01/17.
 */
public class NotaFiscal {

    /**
     * Classe NotaFiscal
     * Atributos:
     * razão social (String),
     * CNPJ (String),
     * valor bruto (double),
     * impostos (double),
     * data de emissao (Calendar)
     * e observações (String)
     */

    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double impostos;
    private Calendar dataDeEmissao;
    private String observacoes;
    private List<ItemDaNota> itensDaNota;

    public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double impostos, Calendar dataDeEmissao,
                      String observacoes, List<ItemDaNota> itensDaNota) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.dataDeEmissao = dataDeEmissao;
        this.observacoes = observacoes;
        this.itensDaNota = itensDaNota;
    }

//    Getters and Setters

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public Calendar getDataDeEmissao() {
        return dataDeEmissao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public List<ItemDaNota> getItensDaNota() {
        return itensDaNota;
    }

    @Override
    public String toString() {

        Formatter fmt = new Formatter(Locale.forLanguageTag("pt"));
        String dataFormatada;
        fmt.format("%tD", dataDeEmissao);

        dataFormatada = fmt.toString();
        return    "Nota Fiscal \n"
                + "Razao social: "+ razaoSocial + "\n"
                + "CNPJ: " + cnpj + "\n"
                + "Valor bruto: R$" + valorBruto + "\n"
                + "Impostos: R$" + impostos + "\n"
                + "Data de emissao da nota: " + dataFormatada + "\n";
    }
}
