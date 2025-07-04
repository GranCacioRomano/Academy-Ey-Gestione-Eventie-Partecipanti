package EsercizioNumero3.State;

import EsercizioNumero3.Singleton.ProfiloUtente;

public class Recupero implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Riposo());
    }

    @Override
    public String mostraStato()
    {
        return "In recupero";
    }


}
