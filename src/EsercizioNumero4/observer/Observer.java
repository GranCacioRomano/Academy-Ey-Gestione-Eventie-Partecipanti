package EsercizioNumero4.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<Disposivo> dispositivi = new ArrayList<>();

    public void aggiungiDispositivo(Disposivo d) {
        dispositivi.add(d);
    }

    public void rimuoviDispositivo(Disposivo d) {
        dispositivi.remove(d);
    }

    public void segnalaEvento(String messaggio) {
        System.out.println("Evento rilevato: " + messaggio + ". Invio notifica a tutti i dispositivi...");
        for (Disposivo d : dispositivi) {
            d.notifica(messaggio);
        }
    }
}
