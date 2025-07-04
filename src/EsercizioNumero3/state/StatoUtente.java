package EsercizioNumero3.state;

import EsercizioNumero3.singleton.ProfiloUtente;

public interface StatoUtente {

    void prossimoStato(ProfiloUtente utente);
    String mostraStato();
}
