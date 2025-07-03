package State;

public class InCorso implements StatoEvento{

    @Override
    public void cambiaStato(Evento evento)
    {
        System.out.println("State.Evento in corso");
        evento.setStato(new Terminato());
    }

    @Override
    public String getStato()
    {
        return "In Corso";
    }
}
