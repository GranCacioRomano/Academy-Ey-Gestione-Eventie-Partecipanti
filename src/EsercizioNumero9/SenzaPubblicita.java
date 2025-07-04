package EsercizioNumero9;

public class SenzaPubblicita extends PianoDecorator {

    public SenzaPubblicita(PianoAbbonamento pianoAbbonamento) {
        super(pianoAbbonamento);
    }

    @Override
    public String getDescrizione() {
        return pianoAbbonamento.getDescrizione() + "Senza pubblicità";
    }

    @Override
    public double getCosto() {
        return pianoAbbonamento.getCosto() + 2;
    }
}
