package EsercizioNumero3.Singleton;


import EsercizioNumero3.State.Riposo;
import EsercizioNumero3.State.StatoUtente;

public class ProfiloUtente {
    private static ProfiloUtente instance;
    private StatoUtente statoUtente;

    private ProfiloUtente(){
        statoUtente = new Riposo();
    }

    public static ProfiloUtente getInstance(){
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

    public String mostraStato() {
        return statoUtente.mostraStato();
    }

    public void prossimoStato() {
        statoUtente.prossimoStato(this);
    }

}
