package observer;

public class Utente implements Partecipante{
    String nome;

    public Utente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aggiorna(String messaggio) {
        System.out.println("Notifica" + messaggio + "a [" + nome + "]");
    }
}
