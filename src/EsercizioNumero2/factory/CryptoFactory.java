package EsercizioNumero2.factory;

public class CryptoFactory extends PagamentoFactory{

    @Override
    public IPagamento creaPagamento()
    {
        return new Crypto();
    }
}
