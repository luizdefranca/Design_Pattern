package State;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class FiltroSaldoMenorQue100 extends Filtro{

    public FiltroSaldoMenorQue100(Filtro outroFiltro){
        super(outroFiltro);
    }

    public FiltroSaldoMenorQue100(){
        super();
    }
    @Override
    public List<Conta> filtra(List<Conta> contas) {

        List<Conta> contasFraudulentas = new ArrayList<>();
        for (Conta conta: contas ) {
            if(conta.getSaldo() < 100) contasFraudulentas.add(conta);
        }
        contasFraudulentas.addAll(passaOutroFiltro(contas));
        return contasFraudulentas;
    }
}
