package EsercizioNumero7.decoratori;

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
