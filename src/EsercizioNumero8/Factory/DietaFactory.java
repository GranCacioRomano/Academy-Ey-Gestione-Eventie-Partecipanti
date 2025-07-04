package EsercizioNumero8.Factory;

import EsercizioNumero8.Strategy.ControlloRicetta;

public abstract class DietaFactory implements ControlloRicetta {

    public abstract ControlloRicetta creaControlloRicetta();

}
