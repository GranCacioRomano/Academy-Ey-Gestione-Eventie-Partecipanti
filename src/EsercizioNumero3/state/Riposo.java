package EsercizioNumero3.state;

import EsercizioNumero3.singleton.ProfiloUtente;

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
