package Builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by luizcarlosframos on 07/01/17.
 */
public class NotaFiscalBuilder {


    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> itensDaNota;
    private double valorBruto;
    private double imposto;
    private Calendar dataDeEmissao;
    private String observacoes;

    public NotaFiscalBuilder(){
        this.itensDaNota = new ArrayList<>();
        this.valorBruto = 0;
        this.imposto = 0;
    }

    public NotaFiscalBuilder withRazaoSocial(String razaoSocial){
        this.razaoSocial = "" + razaoSocial;
        return this;
    }

    public NotaFiscalBuilder withCNPJ(String cnpj){
        this.cnpj = "" + cnpj;
        return this;
    }

    public NotaFiscalBuilder withItem(ItemDaNota item){
        this.itensDaNota.add(item);
        this.valorBruto += item.getValor();
        this.imposto += item.getValor()*0.05;
        return this;
    }

    public NotaFiscalBuilder withDataAtual(){
        this.dataDeEmissao = Calendar.getInstance();
        return this;
    }

    public NotaFiscalBuilder withObservacoes(String observacoes){
        this.observacoes = "" + observacoes;
        return this;
    }

    /*
    l(String razaoSocial,
                  String cnpj,
                  double valorBruto,
                  double impostos,
                  Calendar dataDeEmissao,
                  String observacoes,
                  List<ItemDaNota> itensDaNota)
     */
    public NotaFiscal build(){
        return new NotaFiscal(razaoSocial, cnpj, valorBruto, imposto,
                                        dataDeEmissao, observacoes, itensDaNota);
    }

}
