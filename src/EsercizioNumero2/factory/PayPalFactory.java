package EsercizioNumero2.factory;

public class PayPalFactory extends PagamentoFactory{

    @Override
    public MetodoPagamento creaPagamento()
    {
        return new PayPal();
    }
}
