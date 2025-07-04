package EsercizioNumero7.decoratori;

public class DecoratoreGrassetto extends DecoratoreTesto{

    public DecoratoreGrassetto(Testo testo)
    {
        super(testo);
    }

    public String getTesto()
    {
        return "\033[1m" + testo.getTesto() + "\033[0m";
    }
}
