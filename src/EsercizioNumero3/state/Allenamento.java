package EsercizioNumero3.state;

public class Allenamento implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Recupero);
    }
}
