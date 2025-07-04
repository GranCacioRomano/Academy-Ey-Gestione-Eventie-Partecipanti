package EsercizioNumero4;

import EsercizioNumero4.Adapter.Modem;
import EsercizioNumero4.Adapter.SmartAdapter;
import EsercizioNumero4.Observer.*;

public class Main {
    public static void main(String[] args) {
        Subject o = new Subject();

        DispositivoObserver luce = new Luce("Luce Ingresso");
        DispositivoObserver allarme = new Allarme("Allarme porta");
        DispositivoObserver postazione = new Postazione("Postazione Lavoro");
        Modem modem = new Modem();

        DispositivoObserver modem1 = new SmartAdapter("Adattatore", modem);

        o.aggiungiDispositivo(luce);
        o.aggiungiDispositivo(allarme);
        o.aggiungiDispositivo(postazione);
        o.aggiungiDispositivo(modem1);

        o.segnalaEvento("Arrivo a casa!");

    }
}
