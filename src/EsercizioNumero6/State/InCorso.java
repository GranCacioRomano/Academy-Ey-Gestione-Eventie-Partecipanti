package EsercizioNumero6.State;

public class InCorso implements StatoEvento {

    @Override
    public void cambiaStato(Evento evento)
    {
        evento.notificaPartecipante("Evento in corso");
        evento.setStato(new Terminato());
    }

    @Override
    public String getStato()
    {
        return "In Corso";
    }
}
