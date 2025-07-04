package EsercizioNumero2.Factory;

public class CryptoFactory extends PagamentoFactory{

    @Override
    public MetodoPagamento creaPagamento()
    {
        return new Crypto();
    }
}
