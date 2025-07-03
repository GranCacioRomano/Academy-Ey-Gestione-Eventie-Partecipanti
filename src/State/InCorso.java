package State;

public class InCorso implements StatoEvento{

    @Override
    public void cambiaStato(Evento evento)
    {
        System.out.println("Evento in corso");
        evento.setStato(new Terminato());
    }
}
