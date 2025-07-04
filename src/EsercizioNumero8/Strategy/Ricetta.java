package EsercizioNumero8.Strategy;

public class Ricetta {
    private String nome;
    private boolean keto;
    private boolean vegana;

    public Ricetta(String nome, boolean keto, boolean vegana) {
        this.nome = nome;
        this.keto = keto;
        this.vegana = vegana;
    }

    public String getNome() {
        return nome;
    }

    public boolean isKeto() {
        return keto;
    }

    public boolean isVegana() {
        return vegana;
    }

    @Override
    public String toString() {
        return nome;
    }
}
