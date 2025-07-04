package EsercizioNumero3;

import EsercizioNumero3.Singleton.ProfiloUtente;

public class Main {
    public static void main(String[] args) {
        ProfiloUtente profiloUtente = ProfiloUtente.getInstance();

        System.out.println("Stato iniziale: " + profiloUtente.mostraStato());

        profiloUtente.prossimoStato();
        System.out.println("Primo cambio di stato: " + profiloUtente.mostraStato());

        profiloUtente.prossimoStato();
        System.out.println("Secondo cambio di stato: " + profiloUtente.mostraStato());

        profiloUtente.prossimoStato();
        System.out.println("Terzo cambio di stato: " + profiloUtente.mostraStato());
    }
}