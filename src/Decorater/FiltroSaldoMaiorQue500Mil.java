package Decorater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class FiltroSaldoMaiorQue500Mil extends Filtro{

    public FiltroSaldoMaiorQue500Mil(Filtro outrofiltro){
        super(outrofiltro);
    }
    public FiltroSaldoMaiorQue500Mil(){super();}

    @Override
    public List<Conta> filtra(List<Conta> contas) {

        List<Conta> contasFraudulentas = new ArrayList<>();

        for (Conta conta: contas) {
            if(conta.getSaldo() > 500_000){
                contasFraudulentas.add(conta);
            }

        }
        contasFraudulentas.addAll(passaOutroFiltro(contas));
        return contasFraudulentas;
    }


}
