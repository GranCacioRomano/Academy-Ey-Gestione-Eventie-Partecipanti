package EsercizioNumero8.Factory;

import EsercizioNumero8.Ricetta;
import EsercizioNumero8.Strategy.ControlloRicetta;

import java.util.List;

public class DietaVegana extends DietaFactory{

    @Override
    public ControlloRicetta creaControlloRicetta()
    {
        return new DietaVegana();
    }

    @Override
    public List<Ricetta> controllo(List<Ricetta> ricette) {
        return List.of();
    }
}
