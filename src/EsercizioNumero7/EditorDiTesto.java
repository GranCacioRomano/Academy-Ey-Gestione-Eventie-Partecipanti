package EsercizioNumero7;

import EsercizioNumero7.Strategy.StrategiaSalvataggio;
import EsercizioNumero7.decoratori.Testo;

public class EditorDiTesto {
    private Testo testo;
    private StrategiaSalvataggio strategiaSalvataggio;

    public void setTesto(Testo testo){
        this.testo = testo;
    }

    public void setStrategiaSalvataggio(StrategiaSalvataggio strategiaSalvataggio){
        this.strategiaSalvataggio = strategiaSalvataggio;
    }

    public void mostra(){
        System.out.println("Contenuto del testo: " + testo.getTesto());
    }

    public void salva(){
        strategiaSalvataggio.salvataggio(testo.getTesto());
    }

}
