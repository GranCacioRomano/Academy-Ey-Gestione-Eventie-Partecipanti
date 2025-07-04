package EsercizioNumero4.Observer;

public class Allarme implements DispositivoObserver {
    String nome;

    public Allarme(String nome) {
        this.nome = nome;
    }

    @Override
    public void notifica(String messaggio) {
        System.out.println("L'Allarme riceve la notifica di " + messaggio);

    }

    @Override
    public String getNome() {
        return nome;
    }
}