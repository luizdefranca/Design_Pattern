package State;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luizcarlosframos on 05/01/17.
 */
public abstract class Filtro {

    protected final Filtro outroFiltro;

    protected Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    protected Filtro(){
        this.outroFiltro = null;
    }
    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> passaOutroFiltro(List<Conta> contas){
        if(this.outroFiltro == null) return new ArrayList<>();
        return outroFiltro.filtra(contas);
    }


}
