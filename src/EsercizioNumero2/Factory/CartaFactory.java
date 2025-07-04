package EsercizioNumero2.Factory;

public class CartaFactory extends PagamentoFactory {

    @Override
    public MetodoPagamento creaPagamento()
    {
        return new Carta();
    }
}
