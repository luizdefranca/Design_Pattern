package Decorater;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class FiltroAbertasNoMes extends Filtro{

    public FiltroAbertasNoMes(Filtro outrofiltro){
        super(outrofiltro);
    }

    public FiltroAbertasNoMes(){super();}

    @Override
    public List<Conta> filtra(List<Conta> contas) {

//          Forma Feita por mim
//        List<Conta> contasFraudulentas = new ArrayList<>();
//        for (Conta conta : contas) {
//            int mesAberturaDaConta = getMes(conta.getDataAbertura());
//            int mesAtual = getMes(Calendar.getInstance());
//            int anoAberturaDaConta = getAno(conta.getDataAbertura());
//            int anoAtual = getAno(Calendar.getInstance());
//            if(mesAberturaDaConta == mesAtual && anoAberturaDaConta == anoAtual){
//                contasFraudulentas.add(conta);
//            }
//
//
//        }
//        contasFraudulentas.addAll(passaOutroFiltro(contas));
//        return contasFraudulentas;

//        Forma feito pelo Alura

        List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
            if(c.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
                    c.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
                filtrada.add(c);
            }
        }

        filtrada.addAll(passaOutroFiltro(contas));
        return filtrada;
    }

    private int getMes(Calendar data){
        return data.get(Calendar.MONTH);
    }

    private int getAno(Calendar data){
        return data.get(Calendar.YEAR);
    }


}
