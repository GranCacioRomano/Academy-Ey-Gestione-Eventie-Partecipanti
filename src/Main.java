import State.Evento;
import observer.Utente;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Its the Joint");

        Utente Marco = new Utente("Marco");
        Utente Martina = new Utente("Martina");

        evento.aggiungiPartecipante(Marco);
        evento.aggiungiPartecipante(Martina);

        evento.cambiaStato();
        evento.cambiaStato();
        evento.cambiaStato();

    }
}