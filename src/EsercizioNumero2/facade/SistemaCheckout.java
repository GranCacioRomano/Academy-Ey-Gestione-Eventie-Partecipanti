package EsercizioNumero2.facade;

import EsercizioNumero2.factory.MetodoPagamento;
import EsercizioNumero2.factory.PagamentoFactory;

public class SistemaCheckout {
    public void eseguiPagamento(PagamentoFactory pagamentoFactory, double importo){
        MetodoPagamento metodoPagamento = pagamentoFactory.creaPagamento();
        metodoPagamento.paga(importo);
    }
}
