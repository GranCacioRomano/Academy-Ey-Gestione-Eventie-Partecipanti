package EsercizioNumero7;

import EsercizioNumero7.decoratori.*;
import EsercizioNumero7.Strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Testi disponibili
        Testo base = new TestoBase("Marco è il mas grande");
        Testo decoratoreCorsivo = new DecoratoreCorsivo(base);
        Testo decoratoreSottolineato = new DecoratoreSottolineato(base);
        Testo decoratoreGrassetto = new DecoratoreGrassetto(base);

        Testo baseM = new TestoBase("Martina è la mas grande");
        Testo decoratoreCorsivoM = new DecoratoreCorsivo(baseM);
        Testo decoratoreSottolineatoM = new DecoratoreSottolineato(decoratoreCorsivoM);
        Testo decoratoreGrassettoM = new DecoratoreGrassetto(decoratoreSottolineatoM);

        EditorDiTesto editor = new EditorDiTesto();

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("EDITOR DI TESTO CON PLUGIN");
            System.out.println("1) Testo base");
            System.out.println("2) Testo in corsivo");
            System.out.println("3) Testo sottolineato");
            System.out.println("4) Testo in grassetto");
            System.out.println("5) Testo tutto fatto (corsivo + sottolineato + grassetto)");
            System.out.println("0) Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            Testo scelto = null;

            switch (scelta) {
                case 1 -> scelto = base;
                case 2 -> scelto = decoratoreCorsivo;
                case 3 -> scelto = decoratoreSottolineato;
                case 4 -> scelto = decoratoreGrassetto;
                case 5 -> scelto = decoratoreGrassettoM;
                case 0 -> System.out.println("Uscita dal programma.");
                default -> System.out.println("Opzione non valida, riprova.");
            }

            if (scelto != null) {
                editor.setTesto(scelto);
                editor.mostra();

                System.out.println("Scegli modalità di salvataggio:");
                System.out.println("1) Locale");
                System.out.println("2) Criptato");
                System.out.println("3) Cloud");
                int tipoSalvataggio = scanner.nextInt();
                scanner.nextLine();

                switch (tipoSalvataggio) {
                    case 1 -> editor.setStrategiaSalvataggio(new Locale());
                    case 2 -> editor.setStrategiaSalvataggio(new Criptato());
                    case 3 -> editor.setStrategiaSalvataggio(new Cloud());
                    default -> System.out.println("Tipo di salvataggio non valido. Nessun salvataggio effettuato.");
                }

                if (tipoSalvataggio == 1 || tipoSalvataggio == 2 || tipoSalvataggio == 3) {
                    editor.salva();
                }

                System.out.println();
            }

        } while (scelta != 0);

        scanner.close();
    }
}
