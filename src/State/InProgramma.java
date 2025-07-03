package State;

public class InProgramma implements StatoEvento{

    @Override
    public void cambiaStato(Evento evento)
    {
        System.out.println("Evento programmato");
        evento.setStato(new InCorso());
    }
}
