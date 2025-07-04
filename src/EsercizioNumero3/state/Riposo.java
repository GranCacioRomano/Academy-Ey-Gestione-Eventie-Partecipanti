package EsercizioNumero3.state;

public class Riposo implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Allenamento);
    }
}
