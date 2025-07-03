package State;

public class InProgramma implements StatoEvento{

    @Override
    public void cambiaStato(Evento evento)
    {
        evento.notificaPartecipante("State.Evento programmato");
        evento.setStato(new InCorso());
    }
}
