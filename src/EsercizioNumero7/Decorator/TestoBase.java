package EsercizioNumero7.Decorator;

public class TestoBase implements Testo{
    private String testo = "GranMasterCacio conquisterà il mondo";

    public TestoBase(String testo) {
        this.testo = testo;
    }

    @Override
    public String getTesto()
    {
        return testo;
    }
}
