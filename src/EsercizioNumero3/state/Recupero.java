package EsercizioNumero3.state;

import EsercizioNumero3.singleton.ProfiloUtente;

public class Recupero implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Riposo());
    }

    @Override
    public String mostraStato()
    {
        return "A riposo";
    }


}
