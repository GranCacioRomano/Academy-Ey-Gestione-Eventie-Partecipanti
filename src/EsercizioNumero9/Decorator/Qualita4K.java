package EsercizioNumero9.Decorator;

public class Qualita4K extends PianoDecorator{

    public Qualita4K(PianoAbbonamento pianoAbbonamento) {
        super(pianoAbbonamento);
    }

    @Override
    public String getDescrizione() {
        return pianoAbbonamento.getDescrizione() + ", Qualità 4k";
    }

    @Override
    public double getCosto() {
        return pianoAbbonamento.getCosto() + 2;
    }
}
