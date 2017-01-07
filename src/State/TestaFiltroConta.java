package State;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public class TestaFiltroConta {

    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();

        data.set(2014, 3, 23);
        Conta c1 = new Conta(100, data);

        data.set(2017, 1, 2);
        Conta c2 = new Conta(300_000, data);

        data.set(2014, 3, 23);
        Conta c3 = new Conta(600_000, data);

        data.set(2016, 12, 23);
        Conta c4 = new Conta(500, data);

        List<Conta> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);


        Filtro filtro = new FiltroAbertasNoMes(new FiltroSaldoMaiorQue500Mil(new FiltroSaldoMenorQue100()));

        System.out.println(filtro.filtra(contas));


    }
}
