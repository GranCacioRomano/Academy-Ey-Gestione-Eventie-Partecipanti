package EsercizioNumero3.State;

import EsercizioNumero3.Singleton.ProfiloUtente;

public class Allenamento implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Recupero());
    }

    @Override
    public String mostraStato()
    {
        return "In allenamento";
    }
}
