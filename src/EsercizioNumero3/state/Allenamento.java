package EsercizioNumero3.state;

import EsercizioNumero3.singleton.ProfiloUtente;

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
