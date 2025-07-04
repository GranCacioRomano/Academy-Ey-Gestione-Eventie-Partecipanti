package EsercizioNumero2.factory;

public class CartaFactory extends PagamentoFactory {

    @Override
    public IPagamento creaPagamento()
    {
        return new Carta();
    }
}
