package State;

public class InProgramma implements StatoEvento{

    @Override
    public void cambiaStato(Evento evento)
    {
        System.out.println("State.Evento programmato");
        evento.setStato(new InCorso());
    }

    @Override
    public String getStato()
    {
        return "In Programma";
    }
}
