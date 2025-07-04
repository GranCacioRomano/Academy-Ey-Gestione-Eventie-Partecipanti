package EsercizioNumero3.state;

public class Recupero implements StatoUtente {

    @Override
    public void prossimoStato(ProfiloUtente utente)
    {
        utente.setStato(new Riposo);
    }

    @Override
    public String mostraStato()
    {
        return "A riposo";
    }


}
