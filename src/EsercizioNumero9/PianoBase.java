package EsercizioNumero9;

public class PianoBase implements PianoAbbonamento{
    @Override
    public String getDescrizione() {
        return "Piano Base";
    }

    @Override
    public double getCosto() {
        return 9.99;
    }
}
