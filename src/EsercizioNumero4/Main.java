package EsercizioNumero4;

import EsercizioNumero4.observer.*;

public class Main {
    public static void main(String[] args) {
        Observer o = new Observer();

        Disposivo luce = new Luce("Luce Ingresso");
        Disposivo allarme = new Allarme("Allarme porta");
        Disposivo postazione = new Postazione("Postazione Lavoro");

        o.aggiungiDispositivo(luce);
        o.aggiungiDispositivo(allarme);
        o.aggiungiDispositivo(postazione);

        o.segnalaEvento("Arrivo a casa!");

    }
}
