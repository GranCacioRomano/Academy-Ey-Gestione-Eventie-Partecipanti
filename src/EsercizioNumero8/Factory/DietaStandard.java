package EsercizioNumero8.Factory;

import EsercizioNumero8.Strategy.ControlloRicetta;

public class DietaStandard extends DietaFactory{

    @Override
    public FiltroRicette creaControlloRicetta()
    {
        return new DietaStandard();
    }
}
