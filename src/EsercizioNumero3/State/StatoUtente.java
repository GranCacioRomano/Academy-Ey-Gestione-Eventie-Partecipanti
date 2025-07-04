package EsercizioNumero3.State;

import EsercizioNumero3.Singleton.ProfiloUtente;

public interface StatoUtente {

    void prossimoStato(ProfiloUtente utente);
    String mostraStato();
}
