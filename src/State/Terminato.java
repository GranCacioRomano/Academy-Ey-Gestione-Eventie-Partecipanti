package State;

import State.StatoEvento;

public class Terminato implements StatoEvento {
    @Override
    public void cambiaStato(Evento evento)
    {
        evento.notificaPartecipante("State.Evento terminato");
    }
}
