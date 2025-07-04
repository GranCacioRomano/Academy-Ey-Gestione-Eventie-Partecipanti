package EsercizioNumero3.singleton;


public class ProfiloUtente {
    private static ProfiloUtente instance;
    private StatoUtente statoUtente;

    private ProfiloUtente(){
        statoUtente = new StatoRiposo();
    }

    private static ProfiloUtente getInstance(){
        if (instance == null){
            instance = new ProfiloUtente();
        }
        return instance;
    }

    public void setStato(StatoUtente nuovoStato){
        this.statoUtente = nuovoStato;
    }

    public StatoUtente getStatoUtente() {
        return statoUtente;
    }

    public void mostraStato() {
        statoUtente.mostraStato();
    }

}
