package EsercizioNumero3;

import EsercizioNumero3.singleton.ProfiloUtente;
import EsercizioNumero3.state.Allenamento;
import EsercizioNumero3.state.Recupero;
import EsercizioNumero3.state.Riposo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProfiloUtente profiloUtente = ProfiloUtente.getInstance();

        int scelta;
        profiloUtente.mostraStato();

        do {
            System.out.println("App di Fitness con Monitoraggio Stato Utente");
            System.out.println("Scegli lo stato:");
            System.out.println("1) Riposo");
            System.out.println("2) Allenamento");
            System.out.println("3) Recupero");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1 -> profiloUtente.setStato(new Riposo());
                case 2 -> profiloUtente.setStato(new Allenamento());
                case 3 -> profiloUtente.setStato(new Recupero());
                case 0 -> System.out.println("Uscita dall'app.");
                default -> System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}