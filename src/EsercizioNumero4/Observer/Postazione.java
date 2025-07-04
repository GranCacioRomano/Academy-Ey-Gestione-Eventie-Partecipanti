package EsercizioNumero4.Observer;

public class Postazione implements DispositivoObserver {
    String nome;

    public Postazione(String nome) {
        this.nome = nome;
    }

    @Override
    public void notifica(String messaggio) {
        System.out.println("Il sensore riceve la notifica di " + messaggio);

    }

    @Override
    public String getNome() {
        return nome;
    }
}
