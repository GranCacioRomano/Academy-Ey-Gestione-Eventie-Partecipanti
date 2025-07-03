package State;

import State.StatoEvento;

public class Terminato implements StatoEvento {
    @Override
    public void cambiaStato(Evento evento)
    {
        System.out.println("State.Evento terminato");
    }
}
