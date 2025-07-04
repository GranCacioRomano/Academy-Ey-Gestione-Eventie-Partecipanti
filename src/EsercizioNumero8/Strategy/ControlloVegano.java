package EsercizioNumero8.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ControlloVegano implements ControlloRicetta{
    @Override
    public List<Ricetta> controllo(List<Ricetta> ricette) {
        List<Ricetta> risultato = new ArrayList<>();
        for (Ricetta r : ricette) {
            if (r.isVegana()) risultato.add(r);
        }
        return risultato;
    }
}
