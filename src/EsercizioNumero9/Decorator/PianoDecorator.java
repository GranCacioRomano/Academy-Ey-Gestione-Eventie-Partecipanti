package EsercizioNumero9.Decorator;

public abstract class PianoDecorator implements PianoAbbonamento{
    protected PianoAbbonamento pianoAbbonamento;

    public PianoDecorator(PianoAbbonamento pianoAbbonamento) {
        this.pianoAbbonamento = pianoAbbonamento;
    }
}
