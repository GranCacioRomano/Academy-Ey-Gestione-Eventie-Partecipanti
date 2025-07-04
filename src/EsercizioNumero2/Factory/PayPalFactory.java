package EsercizioNumero2.Factory;

public class PayPalFactory extends PagamentoFactory{

    @Override
    public MetodoPagamento creaPagamento()
    {
        return new PayPal();
    }
}
