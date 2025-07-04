package EsercizioNumero6.State;

public class InProgramma implements StatoEvento {

    @Override
    public void cambiaStato(Evento evento)
    {
        evento.notificaPartecipante("Evento in programma");
        evento.setStato(new InCorso());
    }

    @Override
    public String getStato()
    {
        return "In Programma";
    }
}
