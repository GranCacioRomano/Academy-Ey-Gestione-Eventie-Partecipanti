package EsercizioNumero2.factory;

public class CartaFactory extends PagamentoFactory {

    @Override
    public MetodoPagamento creaPagamento()
    {
        return new Carta();
    }
}
