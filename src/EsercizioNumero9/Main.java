package EsercizioNumero9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PianoAbbonamento base = new PianoBase();
        PianoAbbonamento senzaPubblicita = new SenzaPubblicita(base);
        PianoAbbonamento qualita4K = new Qualita4K(base);
        PianoAbbonamento contenutiEsclusivi = new ContenutiEsclusivi(base);

        PianoAbbonamento baseC = new PianoBase();
        PianoAbbonamento senzaPubblicitaC = new SenzaPubblicita(baseC);
        PianoAbbonamento qualita4KC = new Qualita4K(senzaPubblicitaC);
        PianoAbbonamento contenutiEsclusiviC = new ContenutiEsclusivi(qualita4KC);

        Scanner scanner = new Scanner(System.in);
        GestoreAbbonamento gestore = GestoreAbbonamento.getInstance();


        int scelta;

        do {
            System.out.println("Piattaforma di Streaming con Abbonamenti");
            System.out.println("1) Piano base");
            System.out.println("2) + Senza pubblicità");
            System.out.println("3) + Qualità 4K");
            System.out.println("4) + Contenuti esclusivi");
            System.out.println("5) Tutti i vantaggi (No Ads + 4K + Esclusivi)");
            System.out.println("0) Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            PianoAbbonamento piano = null;

            switch (scelta) {
                case 1 -> piano = base;
                case 2 -> piano = senzaPubblicita;
                case 3 -> piano = qualita4K;
                case 4 -> piano = contenutiEsclusivi;
                case 5 -> piano = contenutiEsclusiviC;
                case 0 -> System.out.println("Uscita dal programma.");
                default -> System.out.println("Scelta non valida.");
            }

            if (piano != null) {
                gestore.setPianoAbbonamento(piano);
                System.out.println("Abbonamento attivo");
                System.out.println("Descrizione: " + gestore.getPianoAbbonamento().getDescrizione());
                System.out.println("Costo: €" + gestore.getPianoAbbonamento().getCosto() + "\n");
            }

        } while (scelta != 0);

        scanner.close();
    }
}
