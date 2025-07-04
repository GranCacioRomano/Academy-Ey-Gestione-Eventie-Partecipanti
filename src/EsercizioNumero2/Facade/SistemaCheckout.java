package EsercizioNumero2.Facade;

import EsercizioNumero2.Factory.MetodoPagamento;
import EsercizioNumero2.Factory.PagamentoFactory;

public class SistemaCheckout {
    public void eseguiPagamento(PagamentoFactory pagamentoFactory, double importo){
        MetodoPagamento metodoPagamento = pagamentoFactory.creaPagamento();
        metodoPagamento.paga(importo);
    }
}
