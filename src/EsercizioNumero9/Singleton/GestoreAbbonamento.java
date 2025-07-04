package EsercizioNumero9.Singleton;

import EsercizioNumero9.Decorator.PianoAbbonamento;
import EsercizioNumero9.Decorator.PianoBase;

public class GestoreAbbonamento {

    private static GestoreAbbonamento instance;
    private PianoAbbonamento pianoAbbonamento;

    private GestoreAbbonamento()
    {
        pianoAbbonamento = new PianoBase();
    }

    public static GestoreAbbonamento getInstance()
    {
        if(instance == null)
            return new GestoreAbbonamento();

        return instance;
    }

    public PianoAbbonamento getPianoAbbonamento()
    {
        return pianoAbbonamento;
    }

    public void setPianoAbbonamento(PianoAbbonamento pianoAbbonamento)
    {
        this.pianoAbbonamento = pianoAbbonamento;
    }



}
