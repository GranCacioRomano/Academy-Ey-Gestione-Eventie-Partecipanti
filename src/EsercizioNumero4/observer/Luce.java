package EsercizioNumero4.observer;

public class Luce implements Disposivo {
    String nome;

    public Luce(String nome) {
        this.nome = nome;
    }

    @Override
    public void notifica(String messaggio) {
        System.out.println("La Luce riceve la notifica di " + messaggio);

    }

    @Override
    public String getNome() {
        return nome;
    }
}
