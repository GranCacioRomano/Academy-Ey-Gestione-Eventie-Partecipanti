package EsercizioNumero7.decoratori;

public class DecoratoreSottolineato extends DecoratoreTesto{

    public DecoratoreSottolineato(Testo testo)
    {
        super(testo);
    }

    public String getTesto()
    {
        return "\033[4m" + testo.getTesto() + "\033[0m";
    }
}
