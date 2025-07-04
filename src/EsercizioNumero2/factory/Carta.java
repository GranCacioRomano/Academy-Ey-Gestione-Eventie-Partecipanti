package EsercizioNumero2.factory;

public class Carta implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + "€ con Carta di Credito.");
    }
}
