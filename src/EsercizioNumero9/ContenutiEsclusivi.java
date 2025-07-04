package EsercizioNumero9;

public class ContenutiEsclusivi extends PianoDecorator{
    public ContenutiEsclusivi(PianoAbbonamento pianoAbbonamento) {
        super(pianoAbbonamento);
    }

    @Override
    public String getDescrizione() {
        return pianoAbbonamento.getDescrizione() + "Contenuti esclusivi";
    }

    @Override
    public double getCosto() {
        return pianoAbbonamento.getCosto() + 2;
    }
}
