package State;

public class Terminato implements StatoEvento{
    @Override
    public void cambiaStato(Evento evento)
    {
        System.out.println("Evento terminato");
    }
}
