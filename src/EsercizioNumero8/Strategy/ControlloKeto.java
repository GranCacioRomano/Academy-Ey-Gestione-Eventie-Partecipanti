package EsercizioNumero8.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ControlloKeto implements ControlloRicetta{
    @Override
    public List<Ricetta> controllo(List<Ricetta> ricette) {
        List<Ricetta> risultato = new ArrayList<>();
        for (Ricetta r : ricette) {
            if (r.isKeto()) risultato.add(r);
        }
        return risultato;
    }
}

