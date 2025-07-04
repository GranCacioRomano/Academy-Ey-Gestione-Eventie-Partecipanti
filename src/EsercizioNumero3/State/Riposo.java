package EsercizioNumero3.State;

import EsercizioNumero3.Singleton.ProfiloUtente;

public class Riposo implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Allenamento());
    }

    @Override
    public String mostraStato()
    {
        return "A riposo";
    }
}
