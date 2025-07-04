package EsercizioNumero4.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<DispositivoObserver> dispositivi = new ArrayList<>();

    public void aggiungiDispositivo(DispositivoObserver d) {
        dispositivi.add(d);
    }

    public void rimuoviDispositivo(DispositivoObserver d) {
        dispositivi.remove(d);
    }

    public void segnalaEvento(String messaggio) {
        System.out.println("Evento rilevato: " + messaggio + ". Invio notifica a tutti i dispositivi...");
        for (DispositivoObserver d : dispositivi) {
            d.notifica(messaggio);
        }
    }
}
