package EsercizioNumero2.Factory;

public class Crypto implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + "€ con Cryptovaluta.");
    }
}
