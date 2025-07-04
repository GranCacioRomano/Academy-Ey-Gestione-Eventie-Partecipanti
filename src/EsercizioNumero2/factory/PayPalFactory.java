package EsercizioNumero2.factory;

public class PayPalFactory extends PagamentoFactory{

    @Override
    public IPagamento creaPagamento()
    {
        return new PayPal();
    }
}
