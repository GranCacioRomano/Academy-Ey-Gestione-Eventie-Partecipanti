package EsercizioNumero2.factory;

public class CryptoFactory extends PagamentoFactory{

    @Override
    public MetodoPagamento creaPagamento()
    {
        return new Crypto();
    }
}
