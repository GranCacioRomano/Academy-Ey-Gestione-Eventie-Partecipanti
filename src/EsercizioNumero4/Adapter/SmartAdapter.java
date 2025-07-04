package EsercizioNumero4.Adapter;

import EsercizioNumero4.Observer.DispositivoObserver;

public class SmartAdapter implements DispositivoObserver {

    private String nome;
    private Modem modem;

    public SmartAdapter(String nome, Modem modem)
    {
        this.nome = nome;
        this.modem = modem;
    }

    @Override
    public void notifica(String messaggio)
    {
        modem.notificaEsterna(messaggio);
    }

    @Override
    public String getNome()
    {
        return nome;
    }
}
