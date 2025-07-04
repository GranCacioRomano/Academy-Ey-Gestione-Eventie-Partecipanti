package EsercizioNumero8.Factory;

import EsercizioNumero8.Strategy.ControlloRicetta;
import EsercizioNumero8.Strategy.ControlloVegano;

public class VeganaFactory extends DietaFactory {
    @Override
    public ControlloRicetta creaControlloRicetta() {
        return new ControlloVegano();
    }
}

