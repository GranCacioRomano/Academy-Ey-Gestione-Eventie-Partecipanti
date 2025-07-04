package EsercizioNumero7.Decorator;

public class DecoratoreCorsivo extends DecoratoreTesto{

    public DecoratoreCorsivo(Testo testo)
    {
        super(testo);
    }

    public String getTesto()
    {
        return "\033[3m" + testo.getTesto() + "\033[0m";
    }
}
