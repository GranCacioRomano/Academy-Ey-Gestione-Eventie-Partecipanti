package EsercizioNumero7.Decorator;

public abstract class DecoratoreTesto implements Testo {

    protected Testo testo;

    public DecoratoreTesto(Testo testo)
    {
        this.testo = testo;
    }

    public String getTesto()
    {
        return testo.getTesto();
    }
}
